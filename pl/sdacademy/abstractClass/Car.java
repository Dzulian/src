package pl.sdacademy.abstractClass;
// Klasa Car rozszerza klasę Vehicle. Jako że w klasie Vehicle znajduje się metoda abstrakcyjna
// (public void repair()) to w tej klasie musi znaleźć się jej implementacja
public class Car extends Vehicle {
    private boolean convertible; //czy kabriolet ? true or false

    public Car(int speed, int maxspeed, boolean convertible) {
        super(speed, maxspeed);
        this.convertible = convertible;
    }

    // Metody abstrakcyjne implementujemy analogicznie do nadpisywania metod.
    // Zaimplementujemy metodę repair z klasy Vehicle (musimy to zrobić - zaimplementować wszystkie
    // odziedziczone metody abstrakcyjne).
    // Podobnie jak w przypadku nadpisywania metody, dobrą praktyką jest dodanie metodzie adnotacji
    // @Override, która posłuży do sprawdzenia na etapie kompilacji, czy na pewno nadpisujemy/implementujemy
    // metodę.
    @Override
    public void repair() {
        System.out.println("Naprawiam samochód - zaglądam pod maskę itd.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "convertible=" + convertible +
                "} " + super.toString();
    }

}
