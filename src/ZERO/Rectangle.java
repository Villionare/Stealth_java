package ZERO;

public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea(){
        double area = this.length * this.width;
        return area;
    }
}
