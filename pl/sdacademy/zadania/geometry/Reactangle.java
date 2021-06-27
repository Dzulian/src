package pl.sdacademy.zadania.geometry;



public class Reactangle extends Shape {
    private int a;
    private int b;

    public Reactangle(String color, int a, int b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
}
