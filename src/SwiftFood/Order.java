package SwiftFood;

public class Order {
    private final int orderId;
    private final String OrderedFoods;
    private final double totalPrice;
    private final String status;

    public Order(int orderId, String orderedFoods, double totalPrice, String status) {
        this.orderId = orderId;
        this.OrderedFoods = orderedFoods;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    protected void showOrderDetails(){
        System.out.println("orderId: " + this.orderId);
        System.out.println("Ordered Foods: " + this.OrderedFoods);
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + this.status);
    }

    protected double calculateTotalPrice(){
        return (this.totalPrice - (this.totalPrice * 5/100));
    }
}
