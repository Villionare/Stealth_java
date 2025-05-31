package ZERO.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Private obj = new Private("Abhay", "male", 20);
        Private obj2 = new Private("Chaitanya", "male", 19);

        obj.setName("siddhu");

        System.out.println(obj.getName() + " " + obj.getGender() + " " + obj.getAge());
    }
}
