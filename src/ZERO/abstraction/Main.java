package ZERO.abstraction;

public class Main implements Interfaces, Interface3, Interface2 {

    @Override
    public void inter() {
        System.out.println("this is from inter");
    }

    @Override
    public void inter2() {
        System.out.println("this is from inter 2");
    }

    @Override
    public void inter3() {
        System.out.println("this is from inter 3");
    }

    public static void main(String[] args) {

        //abstraction is the process of showing only nessessory functions ans hiding the implementation details
        //there are two methods to achieve abstraction in java
        //abstract classes
        //using interfaces
        //so we will be creating a abstract class for user info and mandatory fealds

        AbstractClass obj1 = new AbstractClass();
        obj1.unnessory2();
        obj1.fun();
        obj1.fun1();
        obj1.unnessory2();

        Main obj = new Main();

        obj.inter();
        obj.inter2();
        obj.inter3();
    }
}