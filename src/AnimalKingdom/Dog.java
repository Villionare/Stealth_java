package AnimalKingdom;

public class Dog extends Animal {

        Dog(String name){
        super(name);
        }

        String makeSound(){
            return "the " + getName() + " is making sound woof woof woof";
        }

        String eat() {
            return "the " + getName() + " is eating dogfood";
        }
}


