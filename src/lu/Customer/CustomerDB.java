package lu.Customer;

/**
 * Created by Owner on 2/4/2016.
 */
public class CustomerDB {

    public static Customer getCustomer(String customerNumber){

        // create a customer class
        Customer customer = new Customer();

        // fill the Customer object with data
        customer.setCustomerNumber(customerNumber);
        customer.setDataPresent(false);
        if (customerNumber.equals("1001")){
            customer.setDataPresent(true);
            customer.setFirstName("Barbara");
            customer.setLastName("White");
            customer.setStreetNumber("3400");
            customer.setStreet("Richmond Parkway");
            customer.setAptNumber("#3423");
            customer.setCity("Bristol");
            customer.setState("CT");
            customer.setZipCode("06010");
        } else if (customerNumber.equals("1002")) {
            customer.setDataPresent(true);
            customer.setFirstName("Karl");
            customer.setLastName("Vang");
            customer.setStreetNumber("327");
            customer.setStreet("Franklin Street");
            customer.setAptNumber("");
            customer.setCity("Edina");
            customer.setState("MN");
            customer.setZipCode("55435");
        } else if (customerNumber.equals("1003")) {
            customer.setDataPresent(true);
            customer.setFirstName("Ronda");
            customer.setLastName("Chavan");
            customer.setStreetNumber("518");
            customer.setStreet("Comanche Dr.");
            customer.setAptNumber("");
            customer.setCity("Greensboro");
            customer.setState("NC");
            customer.setZipCode("27410");
        }
        return customer;
    }
}
