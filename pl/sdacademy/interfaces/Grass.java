package pl.sdacademy.interfaces;

// Analogia do klasy Flower - również implementuje interfejs Colorable.
public class Grass implements Colorable {
    private int height;

    public Grass(int height) {
        this.height = height;
    }

    // Klasa Grass implementuje interfejs Colorable, w którym mamy zadeklarowaną metodę String getColor().
    // W związku z tym musimy tę metodę zaimplementować.
    // Wszystkie instancje klasy Grass (trawa) będą zielone.
    @Override
    public String getColor() {
        return "Zielony";
    }
}