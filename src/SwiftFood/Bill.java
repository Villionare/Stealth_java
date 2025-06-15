package SwiftFood;

import java.util.Scanner;

public class Bill {
    private String id;
    private String paymentMode;
    private int counter = 100;
    Scanner s = new Scanner(System.in);

    void paymentMode(String paymentMode){

    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public String getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    void generateBill(Order order){
        System.out.println(" ");
        System.out.println("Your Bill " +"B"+ this.counter +" has been generated!");
        order.showOrderDetails();
        for (String item: order.getOrderedFoods()){
            System.out.println(item);
        }
        System.out.println(" ");
        order.calculateTotalPrice();
        System.out.println("Type your payment Method: ");
        String payment = s.nextLine();
        this.setPaymentMode(payment);
        System.out.println("payment Successfully! Done");
    }
}
