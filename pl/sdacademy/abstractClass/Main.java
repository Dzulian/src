package pl.sdacademy.abstractClass;

public class Main {
    public static void main(String[] args) {
        // Nie możemy utworzyć instancji klasy abstrakcyjnej.
        // Przykład: Vehicle vehicle1 = new Vehicle(5,10);
        // System.out.println(vehicle1);

        // Przypiszemy do zmiennej typu Vehicle obiekt klasy
        // nieabstrakcyjnej, która tę klasę rozszerza.
        Vehicle vehicle1 = new Car(0, 190, true);
        System.out.println(vehicle1);

        // O obiekcie przypisanym do zmiennej vehicle wiemy na pewno,
        // że implementuje metodę repair.
        // Mimo, że metoda repair w klasie Vehicle nie posiada implementacji,
        // to obiekt przypisany do zmiennej
        // vehicle1 musi być typu, który taką imlementację będzie miał.
        vehicle1.repair();

        // Analogiczny przykład z tablicą pojazdów.
        System.out.println("\n Naprawianie pojazdów z tablicy:");
        Vehicle[] vehicles = {
                vehicle1,
                new Car(60, 230, false),
                new Bicycle(10, 20, 12)
        };
        for (Vehicle vehicle : vehicles) {
            // Każdy element tablicy przypisanej do zmiennej vehicles na
            // pewno implementuje metodę repair.
            vehicle.repair();
        }
    }

}
