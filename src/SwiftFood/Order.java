package SwiftFood;

import java.util.Arrays;

public class Order {
    private int orderId;
private String[] OrderedFoods;
    private double totalPrice;
    private String status = "Ordered";
    private static double dileveryCharge = 1.5/100;

    public Order(int orderId, String[] orderedFoods, double totalPrice, String status) {
        this.orderId = orderId;
        this.OrderedFoods = orderedFoods;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public static double getDileveryCharge() {
        return dileveryCharge;
    }

    public static void setDileveryCharge(double dileveryCharge) {
        Order.dileveryCharge = dileveryCharge;
    }

    protected void showOrderDetails(){
        System.out.println("orderId: " + this.orderId);
        System.out.println("Ordered Foods: " + Arrays.toString(this.OrderedFoods));
        System.out.println("Total Price: " + this.totalPrice);
        System.out.println("Status: " + this.status);
    }

    public int getOrderId() {
        return orderId;
    }

    public String[] getOrderedFoods() {
        return OrderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderedFoods(String[] orderedFoods) {
        OrderedFoods = orderedFoods;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }



    protected double calculateTotalPrice(){
        return (this.totalPrice - (this.totalPrice * 5/100) + dileveryCharge);
    }
}
