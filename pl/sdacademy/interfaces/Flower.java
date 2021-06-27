package pl.sdacademy.interfaces;

// To, że klasa implementuje interfejs zapisujemy za pomocą implements <nazwa interfejsu>.
// Jeśli klasa implementuje interfejs, to musi zaimplementować wszystkie (abstrakcyjne) metody tego interfejsu.
// Klasa Flower implementuje interfejs Colorable, to znaczy, że musi implementować metodę getColor tego interfejsu.
public class Flower implements Colorable {
    private String type;
    private int height;
    private String color;

    public Flower(String type, int height, String color) {
        this.type = type;
        this.height = height;
        this.color = color;
    }

    // Klasa Flower implementuje interfejs Colorable, w którym mamy zadeklarowaną metodę String getColor().
    // W związku z tym musimy tę metodę zaimplementować.
    @Override
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

}
