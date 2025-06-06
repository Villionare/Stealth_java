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

        //upcasting refers to a sub class refrence is treated with super class reference (implicit conversion)
        E a = new F();
        a.aa();

        //down casting refers to converting a super class reference back to child reference

    }
}
