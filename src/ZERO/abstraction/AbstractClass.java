package ZERO.abstraction;

abstract class AbstractClass{

    String name;

    AbstractClass(String name){
        this.name = name;
    }

    void fun(){
        System.out.println("this is a function and has a name " + name);
    }

    abstract void runfun();
}