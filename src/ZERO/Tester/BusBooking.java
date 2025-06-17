package ZERO.Tester;

public class BusBooking {
    private int BookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId,String destination, String tripPackage) {
        BookingId = bookingId;
        this.tripPackage = tripPackage;
        this.destination = destination;
        this.totalAmount = 0;
    }

    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int bookingId) {
        BookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String bookTrip(String couponCode, int numberOfMembers) throws InvalidDestinationException, InvalidTripPackageException, InvalidCouponException {

        if(!(this.destination.equals("Washington DC") || this.destination.equals("Philadelphia") || this.destination.equals("Orlando") || this.destination.equals("Boston") || this.destination.equals("Atlanta"))){
            throw new InvalidDestinationException("Invalid Destination");
        }

        if(!(this.tripPackage.equals("Regular") || this.tripPackage.equals("Premium"))){
            throw new InvalidTripPackageException("Invalid package");
        }

        if(!this.validateCouponCode(couponCode, numberOfMembers)){
            throw new InvalidCouponException("Invalid Coupon");
        }

        if (this.tripPackage.equals("Regular")) {
            totalAmount = 500 * numberOfMembers;
        } else if (this.tripPackage.equals("Premium")){
            totalAmount = 800 * numberOfMembers;
        }

        return "Booking successful";
    }

    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponException{
        if(!((couponCode.equals("BIGBUS")  && numberOfMembers >= 10) || (couponCode.equals("MAGICBUS")  && numberOfMembers >= 15))){
            throw new InvalidCouponException("Invalid coupon code");
        } else {
            return true;
        }
    }
}

