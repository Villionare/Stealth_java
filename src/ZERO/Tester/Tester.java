package ZERO.Tester;

class A {
    protected String name;
    protected int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        A other = (A) obj;
        return name.equals(other.name) && age == other.age;
    }

    @Override
    public String toString() {
        return "A{name='" + name + "', age=" + age + "}";
    }
}

public class Tester {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();

        a.name = "abhay singh";
        a.age = 21;

        b.name = "abhay singh";
        b.age = 21;

        System.out.println(a.equals(b));  // Should print true
        System.out.println(a.toString()); // Should print A{name='abhay singh', age=21}
    }
}