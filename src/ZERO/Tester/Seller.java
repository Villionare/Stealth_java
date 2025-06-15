package ZERO.Tester;

public class Seller implements Tax {
    String location;
    double taxPercentage;

    public Seller(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double calculateTax(double price){
        if(this.location.equals("Middle east")){
            this.taxPercentage = 14;
            return price * 14/100;
        } else if (this.location.equals("Europe")){
            this.taxPercentage = 25;
            return price * 25/100;

        } else if (this.location.equals("Canada")) {
            this.taxPercentage = 22;
            return price * 22/100;

        } else if (this.location.equals("Japan")) {
            this.taxPercentage = 12;
            return price * 12/100;
        }
    return 0;
    }
}
