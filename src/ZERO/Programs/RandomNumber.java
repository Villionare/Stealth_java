package ZERO.Programs;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("welcome to random number generator:");
        System.out.println(random.nextInt(1, 101));
        System.out.println(random.doubles());
        System.out.println(random.nextFloat());
        System.out.println(random.nextLong());
        System.out.println("math " + Math.random());

//        Math.random() * (max - min + 1) + min
        //formula to genrate random number between a specific range
        //In the above formula, the min value is inclusive while the max value is exclusive.

    }
}
