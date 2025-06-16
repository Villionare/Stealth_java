package ZERO.Tester;

public class Circle {
    private final double PI = 3.14;
    private double diameter;
    private double circumference;
    private double area;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public void calculateCircumference(){
        this.circumference = 2 * PI * this.diameter/2;
    }

    public void  calculateArea(){
        this.area = PI * this.diameter/2 * this.diameter/2;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }


    public double getPI() {
        return PI;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
