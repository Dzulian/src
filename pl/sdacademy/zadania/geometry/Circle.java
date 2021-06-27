package pl.sdacademy.zadania.geometry;


public class Circle extends Shape {
private double r;


    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r ;
    }
}
