import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class Main {
    @Test
    public void validatePaymentOptionTestInvalid() {
        Bill bill = new Bill("Paypal");
        // Provide a valid value and observe the JUnit test report
        Assert.assertFalse(bill.validatePaymentOption());
    }
}
class Bill {
    private String paymentMode;
    // other variables and methods
    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    public boolean validatePaymentOption() {
        if (paymentMode.equals("Credit Card")
                || paymentMode.equals("Debit Card")
                || paymentMode.equals("PayPal")
                || paymentMode.equals("Amazon Pay")
                || paymentMode.equals("Google Pay")) {
            return true;
        }
        return false;
    }
}