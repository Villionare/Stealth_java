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


//upcasting and down casting && Dynamic Method Dispatch

class first{
    void fun(){
        System.out.println("this is a parent fun.");
    }
}

class second extends first{
    @Override
    void fun(){
        System.out.println("this is overridden now");
    }
}

public class DynamicMethodDispatch{
    public static void main(String[] args) {
        first a = new second(); //this is upcasting and it is implicit
        a.fun(); //this is dynamic method dispatch, as the overridden method gets called

        second b = (second) a; //this is down-casting and this is explicit conversion
        b.fun();
    }
}