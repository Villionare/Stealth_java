package ZERO.Tester;

public class PurchaseDetails implements Tax {
    private String puchaseId;
    private String paymentType;
    private double taxPercentage;

    public PurchaseDetails(String puchaseId, String paymentType) {
        this.puchaseId = puchaseId;
        this.paymentType = paymentType;
    }

    public void setPuchaseId(String puchaseId) {
        this.puchaseId = puchaseId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getPuchaseId() {
        return puchaseId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }


    public double calculateTax(double price){
        if(this.paymentType.equals("Debit Card")){
            this.taxPercentage = 2;
            return price + (price * 2/100);
        } else if (this.paymentType.equals("Credit Card")) {
            this.taxPercentage = 3;
            return price + (price * 3/100);
        } else {
            this.taxPercentage = 4;
            return price + (price * 4/100);
        }
    }
}
