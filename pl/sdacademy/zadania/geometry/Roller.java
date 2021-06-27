package pl.sdacademy.zadania.geometry;

public class Roller implements Solid {
    //9.Tworzymy klasy reprezentujące bryły obrotowe:
    //Stożek oraz Walec
private int r;
private int h;

    public Roller(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public int getH() {
        return h;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * r * r + 2 * Math.PI * r * h ;
    }

    @Override
    public double getVolume() {
        return Math.PI * r * r * h;
    }
}
