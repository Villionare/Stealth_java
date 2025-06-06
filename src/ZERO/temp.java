package ZERO;

class Ab {
    String s = "this is a string";
    void fun(){
        System.out.println("this is a class");
    }
}

class Bc extends Ab{
    @Override
    void fun(){
        System.out.println("this is a function from sub class");
    }
}


public class temp {
    public static void main(String[] args) {
        Ab a = new Bc();
        a.fun();

        //this is upcasting
    }
}
