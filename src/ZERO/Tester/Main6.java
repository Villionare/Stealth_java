package ZERO.Tester;

public class Main6 {
        public static void main(String[] args) throws InvalidTripPackageException, InvalidDestinationException, InvalidCouponException {
            BusBooking booking = new BusBooking(101,"Orlando", "Regular");
            String result = booking.bookTrip("BIGBUS", 11);
            if(result.equals("Booking successful")){
                System.out.println(result);
                System.out.println("Total amount for the trip: " + booking.getTotalAmount());
            }
            else{
                System.out.println(result);
                System.out.println("Your booking was not successful, please try again!");
            }
        }
}
