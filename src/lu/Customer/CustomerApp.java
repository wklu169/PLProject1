package lu.Customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        // Prints welcome statement to the terminal window.
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // Prompt user to input a customer number
            System.out.println("Enter a customer number: ");
            String customerNumber = sc.nextLine();
            System.out.println();

            // Get the Customer object from CustomerDB
            Customer customer = CustomerDB.getCustomer(customerNumber);

            // Display the Customer object
            if (customer.getDataPresent()){
                String data = customer.getName() + "\n" +
                        customer.getAddress() + "\n";
                System.out.println(data);
            } else{
                System.out.println("There is no customer number " +
                        customer.getCustomerNumber() + " in our records.\n");
            }

            // Ask if the user want to display another customer
            System.out.println("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
            while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")){
                System.out.println("Not a valid choice.\nDisplay another customer? (y/n): ");
                choice = sc.nextLine();
                System.out.println();
            }
        }
    }

}
