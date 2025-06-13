package SwiftFood;

public class Customer {
    private String id;
    private String customerType;
    private String name;
    private long contactNumber;
    private String address;

    public Customer(String id, String customerType, String name, long contactNumber, String address) {
        this.id = id;
        this.customerType = customerType;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public Customer(String id, String name, long contactNumber, String address) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    void getCustomerDetails(){
        System.out.println("customer Details:");
        System.out.println("ID: " + this.id);
        System.out.println("name: " + this.name);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println("Customer Type: " + this.customerType);
        System.out.println("Address: " + this.address);
    }

    void updateCustomersDetails(String id, String name, long contactNumber, String address){
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;

    }

    void payBills(double totalPrice, double discount){
        System.out.println("Calculating the final amount to be paid...");
        int final_amount = (int) (totalPrice - totalPrice * (discount/100));
        System.out.printf("Hey %s your final amount to be paid is: %f",this.name, final_amount);
    }
}
