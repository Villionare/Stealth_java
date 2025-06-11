package ZERO;

public class Question5 {
    //Inheritance, Polymorphism, and static keyword

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("red", 5,3);
        Circle circle = new Circle("Yellow", 5);

        System.out.println(rectangle.calculateArea());
        rectangle.displayColor();

        System.out.println(circle.calculateArea());
        circle.displayColor();

        System.out.println(Shape.getShapeCount());
    }
}
