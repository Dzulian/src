package pl.sdacademy.zadania.product;

public class Milk implements Product {
   //objętość w m3
    //gęstość w kg/m3
    private int density;
    private int capacity;
    private int priceForKilo;

    public Milk(int density, int capacity, int priceForKilo) {
        this.density = density;
        this.capacity = capacity;
        this.priceForKilo = priceForKilo;
    }

    public double getDensity() {
        return density;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getPriceForKilo() {
        return priceForKilo;
    }

    @Override
    public int getPrice() {
        return getWeight() * priceForKilo;
    }

    @Override
    public int getWeight() {
        return density * capacity ;
    }

}
