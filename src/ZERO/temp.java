package ZERO;

public class temp {
    class temp {
        //Implement your code here
        private int movieId;
        private int noOfSeats;
        private double costPerTicket;
    }


    class Tester {
        public static void main(String[] args) {
            temp movieTicket = new temp(112, 3);
            double amount = movieTicket.calculateTotalAmount();
            if (amount==0)
                System.out.println("Sorry! Please enter valid movie Id and number of seats");
            else
                System.out.println("Total amount for booking : $" + amount);
        }
    }
}
