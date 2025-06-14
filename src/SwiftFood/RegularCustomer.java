package SwiftFood;

public class RegularCustomer extends Customer {
    private float discount = 1.5f;

    RegularCustomer(String id, String customerType, String name, long contactNumber, String address){


        super(id, "Regular", name, contactNumber, address);
    }
}
