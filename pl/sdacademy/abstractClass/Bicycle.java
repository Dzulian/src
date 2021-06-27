package pl.sdacademy.abstractClass;

public class Bicycle extends Vehicle {
    private int gears;

    public Bicycle(int speed, int maxspeed, int gears) {
        super(speed, maxspeed);
        this.gears = gears;
    }

    @Override
    public void repair() {
        System.out.println("Naprawiam rower - sprawdzam, czy działa kierownica,czu łańcuch jest założony itd.");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gears=" + gears +
                "} " + super.toString();
    }
}
