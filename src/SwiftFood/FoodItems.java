package SwiftFood;

public class FoodItems {
    private String name;
    private String cuisine;
    private String type;
    private int qtyAvailable;
    private double unitPrice;

    public FoodItems(String name, String cuisine, String type, int qtyAvailable, double unitPrice) {
        this.name = name;
        this.cuisine = cuisine;
        this.type = type;
        this.qtyAvailable = qtyAvailable;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getType() {
        return type;
    }

    public int getQtyAvailable() {
        return qtyAvailable;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQtyAvailable(int qtyAvailable) {
        this.qtyAvailable = qtyAvailable;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
