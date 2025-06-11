package ZERO;

public abstract class Shape {
    protected String color;
    protected static int counter = 0;

    abstract double calculateArea();

    void displayColor(){
        System.out.println("so the color of the shape is: " + this.color);
    }

    Shape(String color){
        this.color = color;
        counter++;
    }
    
    static int getShapeCount(){
        return counter;
    }


}
