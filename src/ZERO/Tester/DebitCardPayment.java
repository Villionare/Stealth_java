package ZERO.Tester;

public class DebitCardPayment extends Payment{

    public static int counter;

    static {
        counter = 1000;
    }

    private double discountPercentage;

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public DebitCardPayment(int customerId) {
        super(customerId);
        counter++;
        setPaymentId("D" + counter);
    }

    public int getCounter() {
        return counter;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    double payBill(double amount){

        if (amount <= 500) {

            this.setDiscountPercentage(1);
            this.setServiceTaxPercentage(2.5);

        } else if (amount > 500 && amount <= 1000) {

            this.setDiscountPercentage(2);
            this.setServiceTaxPercentage(4);

        } else if (amount > 1000) {

            this.setDiscountPercentage(3);
            this.setServiceTaxPercentage(5);

        }
        return amount - (amount * (this.getDiscountPercentage() / 100.0)) + (amount * (this.getServiceTaxPercentage() / 100.0));
    }
}
