package pl.sdacademy.zadania.geometry;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Reactangle("czerwony",4,6);
        System.out.println("pole powierzchni kształtu nr 1(prostokąta):" + shape1.getArea());
        System.out.println("obwód prostokąta: " + shape1.getPerimeter());
        System.out.println("kolor prostokąta:" + shape1.getColor());

        Shape shape2 = new Circle("niebieski",8);
        System.out.println("Pole powierzchni kształtu nr 2 (koła) wynosi:" + shape2.getArea());
        System.out.println("Obwód koła: " + shape2.getArea());
        System.out.println("Kolor koła: " + shape2.getColor());

        Shape shape3 = new Square("żółty",4);
        System.out.println("Pole powierzchni kształtu nr 3 (kwadratu) wynosi: " + shape3.getArea());
        System.out.println("Obwód kształtu nr 3 (kwadratu) wynosi: " + shape3.getPerimeter());

        Solid solid1 = new Cone(12,4,7);
        System.out.println("Pole powierzchni bryły nr 1 (stożka) wynosi:  " + solid1.getSurfaceArea());
        System.out.println("Objętość bryły nr1 (stożka) wynosi: " + solid1.getVolume());

        Solid solid2 = new Cube(4);
        System.out.println("Pole powierzchni bryły nr 2 (szescianu) wynosi:  " + solid2.getSurfaceArea());
        System.out.println(solid2.getVolume());

        Solid solid3 = new Cuboid(4,5,7,9);
        System.out.println("Pole powierzchni cakowitej bryly nr 3 (prostopadocianu) wynosi: " + solid3.getSurfaceArea());
        System.out.println("Objętość bryły nr3 (prostopadocianu) wynosi: " + solid3.getVolume());

        Solid solid4 = new Roller(8,12);
        System.out.println("Pole powierzchni bryly nr4 (walca) wynosi: " + solid4.getSurfaceArea());
        System.out.println("Objętość bryły nr4 (walca) wynosi: " + solid4.getVolume());

    }
}
