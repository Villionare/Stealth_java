package ZERO;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
