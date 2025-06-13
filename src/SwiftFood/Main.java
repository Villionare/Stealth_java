package SwiftFood;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the SwiftFood!");
        Customer customer1 = new Customer("sdfklj45", "regular", "Abhay", 876565498, "India");
        Order order1 = new Order(234, "Coka cola", 345.45, "pending");
        customer1.getCustomerDetails();
        order1.showOrderDetails();
    }
}
