package pl.sdacademy.zadania.geometry;

public class Cone implements Solid {
    //9. Tworzymy klasy reprezentujące bryły obrotowe:
    //Stożek oraz Walec
private double r;
private int l;
private int h;

    public Cone(double r, int l, int h) {
        this.r = r;
        this.l = l;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public int getL() {
        return l;
    }

    public int getH() {
        return h;
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI * r *r + Math.PI * r * l;
    }

    @Override
    public double getVolume() {
        return Math.PI * r * h / 3 ;
    }
}
