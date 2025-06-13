package SwiftFood;

public class Restaurant {

    private String restaurantName;
    private long[] restaurantContact;
    private String restaurantAddress;
    private float rating;

    void displayRestaurantDetails(){

        System.out.println("Restaurant Details\n*****************");
        System.out.println("Restaurant name: " + this.restaurantName);
        System.out.println("Restaurant Rating: " + this.rating);
        System.out.println("Restaurant Contact: ");
        for (long l : this.restaurantContact) {
            System.out.println(l);
        }
        System.out.println("Restaurant Address: " + this.restaurantAddress);

    }

    public Restaurant(String restaurantName, long[] restaurantContact, String restaurantAddress, float rating) {
        this.restaurantName = restaurantName;
        this.restaurantContact = restaurantContact;
        this.restaurantAddress = restaurantAddress;
        this.rating = rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public long[] getRestaurantContact() {
        return restaurantContact;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public float getRating() {
        return rating;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setRestaurantContact(long[] restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
