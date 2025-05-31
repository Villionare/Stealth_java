package ZERO.Encapsulation;

public class Private {
    private int age;
    private String name;
    private String gender;

    protected String getName(){
        return name;
    }

    protected String getGender() {
        return gender;
    }

    protected int getAge(){
        return age;
    }

    protected void setName(String name){
        this.name = name;
    }

    Private(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
