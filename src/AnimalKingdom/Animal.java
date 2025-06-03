package AnimalKingdom;

abstract class Animal {
    private String name;

    Animal(String name){
        this.name = name;
    }

    abstract String makeSound();
    abstract String  eat();

    public String getName() {
        return name;
    }
}
