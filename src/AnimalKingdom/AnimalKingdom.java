package AnimalKingdom;

public class AnimalKingdom {

    public static void main(String[] args) {
        Dog dog = new Dog("mukku");
        Cat cat = new Cat("kiyo");

        System.out.println(dog.eat());
        System.out.println(dog.makeSound());

        System.out.println(cat.eat());
        System.out.println(cat.makeSound());
    }
}
