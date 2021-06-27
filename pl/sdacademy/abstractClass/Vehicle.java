package pl.sdacademy.abstractClass;
// Klasa abstrakcyjna, to klasa której obiektów nie można utworzyć.
// Dodatkowo, taka klasa może zawierać metody abstrakcyjne (opis poniżej
// przy takiej metodzie).
// O tym, że klasa jest abstrakcyjna mówi słówko "abstract" w sygnaturze przed słówkiem "class"
public abstract class Vehicle {
    private int speed;
    private int maxspeed;

    public Vehicle(int speed, int maxspeed) {
        this.speed = speed;
        this.maxspeed = maxspeed;
    }


    // Metoda abstrakcyjna, to metoda, której mamy jedynie deklarację (bez ciała). Implementacja metody repair
    // znajdzie się w każdej klasie, która dziedziczy po klasie Vehicle (a która sama nie jest abstrakcyjna).
    // Dzięki temu wiemy, że obiekt, który jest pojazdem na pewno oferuje metodę repair, ale w zależności
    // od typu tego pojazdu, implementacja może się różnić.
    // Słówko abstract w sygnaturze metody wskazuje, że metoda jest abstrakcyjna.
    public abstract void repair();

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", maxspeed=" + maxspeed +
                '}';
    }
}
