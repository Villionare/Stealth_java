package ZERO.abstraction;

public  abstract class AbstractClass2 extends AbstractClass3{

    AbstractClass2(){
        System.out.println("this is a constructor from abstract class 3");
    }

    @Override
    void nessessory(){
        System.out.println("this is the nessessory function of abstract class 3");
    }

    abstract void unnessory2();

    void fun1(){
        System.out.println("this is fun1 form abstract class 2");
    }
}
