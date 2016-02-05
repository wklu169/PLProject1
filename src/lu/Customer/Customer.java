package lu.Customer;

/**
 * Created by Owner on 2/4/2016.
 */
public class Customer {

    // the instance variables
    private String customerNumber;
    private boolean dataPresent;
    private String firstName;
    private String lastName;
    private String streetNumber;
    private String street;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;

    // the constructor
    public Customer(){}

    // set and get methods for instance variables
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber(){
        return customerNumber;
    }

    public void setDataPresent(boolean dataPresent){
        this.dataPresent = dataPresent;
    }

    public boolean getDataPresent(){
        return dataPresent;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setStreetNumber(String streetNumber){
        this.streetNumber = streetNumber;
    }

    public String getStreetNumber(){
        return streetNumber;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getStreet(){
        return street;
    }

    public void setAptNumber(String aptNumber){
        this.aptNumber = aptNumber;
    }

    public String getAptNumber(){
        return aptNumber;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return zipCode;
    }

    // methods for getting Name and Address
    public String getName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getAddress(){
        return this.getStreetNumber() + " " + this.getStreet() + " " + this.getAptNumber() + "\n" +
                this.getCity() + ", " + this.getState() + " " + this.getZipCode();
    }
}
