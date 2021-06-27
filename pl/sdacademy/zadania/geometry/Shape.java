package pl.sdacademy.zadania.geometry;

public abstract class   Shape {
    private String color;
    private int area;
    private int perimeter;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
