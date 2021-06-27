package pl.sdacademy.interfaces;

public class Main {
    public static void main(String[] args) {
        // Do zmiennej typu Colorable możemy przypisać obiekt typu,
        // który ten interfejs implementuje
        Colorable colorable1 = new Flower("Róża", 13, "czerwony");
        // O takim obiekcie, jako że jest typu implementującego ten interfejs wiemy tyle, że na pewno
        // implementuje metody interfejsu (metodę getColor w tym przypadku).

        System.out.println(colorable1.getColor());

        // Analogiczny przykład z obiektem typu Grass -
        // klasa Grass również implementuje interfejs
        // Colorable, więc instancję tego typu możemy przypisać do zmiennej
        // o nazwie colorable.
        Colorable colorable2 = new Grass(123);
        System.out.println(colorable2.getColor());


        // Możemy wywołać metodę, która jako argumentu oczekuje implementacji
        // interfejsu Colorable przekazując
        // zarówno instancję klasy Grass, jak i Flower
        // (bo obydwie te klasy ten interfejs implementują).
        describe(colorable1); //metoda opisz
        describe(new Grass(5));
    }

    private static void describe(Colorable colorable) {
        System.out.println("Kolorowalny obiekt, który ma kolor: " + colorable.getColor());
    }
}
