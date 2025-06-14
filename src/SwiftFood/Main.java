package SwiftFood;

public class Main {
    public static void main(String[] args) {
        String[] orderedFoods = {"Coke cola","pizza", "hot chocolate"};
        System.out.println("Welcome to the SwiftFood!");
        Customer customer1 = new Customer("sdfklj45", "regular", "Abhay", 876565498, "India");
        Order order1 = new Order(234, orderedFoods , 345.45, "pending");
        customer1.getCustomerDetails();
        order1.showOrderDetails();

        long[] contacts = {436756756,343464754,344534534};
        Restaurant first = new Restaurant("dhaba style", contacts, "delhi", 4.6f);

        first.displayRestaurantDetails();

        Bill b = new Bill();
        b.generateBill(order1);
    }
}
