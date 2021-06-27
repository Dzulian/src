package pl.sdacademy.zadania.geometry;

public class Cube implements Solid {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    //Pc = 6a^2
    @Override
    public double getSurfaceArea() {
        return 6 * a * a;
    }

    // V =a^3
    @Override
    public double getVolume() {
        return a * a * a;
    }
}
