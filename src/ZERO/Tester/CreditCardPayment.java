package ZERO.Tester;

public class CreditCardPayment extends Payment{

    private static int counter;

    static {
        counter = 1000;
    }
    public CreditCardPayment(int customerId) {
        super(customerId);
        counter++;
        setPaymentId("C" + counter);
    }

//    public void setCounter(int counter) {
//        this.counter = counter;
//    }

    public int getCounter() {
        return counter;
    }

    double payBill(double amount){
        if (amount <= 500) {

            this.setServiceTaxPercentage(3);

        } else if (amount > 500 && amount <= 1000) {

            this.setServiceTaxPercentage(5);

        } else if (amount > 1000) {

            this.setServiceTaxPercentage(6);

        }

        return  amount - (amount * (this.getServiceTaxPercentage() / 100.0));
//        return amount - (amount * this.getServiceTaxPercentage());
    }
}
