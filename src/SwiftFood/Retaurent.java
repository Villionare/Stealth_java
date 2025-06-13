package SwiftFood;

public class Retaurent {

    String restaurantName;
    long restaurantContact;
    String restaurantAddress;
    float rating;

    void displayRestaurantDetails(String restaurantName, long restaurantContact, String restaurantAddress, float rating){

        System.out.println("Restaurant Details\n*****************");
        System.out.println("Restaurant name: " + this.restaurantName);
        System.out.println("Restaurant Rating: " + this.rating);
        System.out.println("Restaurant Contact: " + this.restaurantContact);
        System.out.println("Restaurant Address: " + this.restaurantAddress);

    }


}
