package ZERO;


class E{
    //parent class
    void aa(){
        System.out.println("this is E parent class");
    }
}

class F extends E{
    //child
    void a(){
        System.out.println("this is F child class");
    }
}

public class Upcasting_downcasting {

    public static void main(String[] args) {

        E a = new F();
        a.aa();
    }
}
