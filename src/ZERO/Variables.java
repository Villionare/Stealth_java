package ZERO;

public class Variables {
    //there are three types of variables in java
    //instance variable, static variable - local variable

    static int a = 77; //static variable
    int b = 99; //instance variable

    static void fun(){
    int a = 88; //local variable

        System.out.println(a);
    }

    public static void main(String[] args) {

        Variables obj1 = new Variables();

        System.out.println(obj1.b); //calling the instance variable
        System.out.println(Variables.a); //calling the static variable
        fun(); //calling the local variable

    }
}
