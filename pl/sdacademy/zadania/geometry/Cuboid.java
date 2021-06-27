package pl.sdacademy.zadania.geometry;

public class Cuboid implements Solid {
    private int a;
    private int b;
    private int c;
    private int d;

    public Cuboid (int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }
//Pc = 2ab + 2ac +2bc = 2(ab+ac+bc)
    @Override
    public double getSurfaceArea() {
        return 2 * a * b + 2 * a * c + 2 *b *c;
    }
// V =abc
    @Override
    public double getVolume() {
        return a*b*c ;
    }
}
