package ZERO;

//DYNAMIC METHOD DISPATCH PROGRAM - usage of Runtime Polymorphism

//helper classes - there can be multiple helper calsses, but they cant have public access and the public one will always be the main class
class A{
 void ff(){
        System.out.println("this is a helper class");
 }
}

class B extends A {
    void ff() {
        System.out.println("this is a method of B class");
    }
}

class C extends A{
    void ff(){
        System.out.println("this is a method of C class");
    }
}

class D extends A{
    void ff(){
        System.out.println("this is a method of D class");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        A a = new A();
        //A = class name
        //a = reference variable
        //new A() = object creation
        a.ff();

        //IRRESPECTIVE OF WHAT CLASS TYPE YOU HAVE ALL THAT MATTERS IS THE WHAT TYPE OF OBJECT IS CREATED
        A b = new B();//the type of the variable dosent matter e.g. A but matter the object creation B(), so this will call class B fun.
        b.ff();

        A c = new C();
        c.ff();

        A d = new D();
        d.ff();

    }
}
