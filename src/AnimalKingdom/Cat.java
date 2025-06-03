package AnimalKingdom;

public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    String makeSound(){
        return "the " + getName() + " is making sound mew mew";
    }

    String eat(){
        return "the " + getName() + " is eating fish";
    }
}
