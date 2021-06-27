package pl.sdacademy.zadania.product;

public class ChocolateBar implements Product {
    private int price;
    private int weight;

    public ChocolateBar(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
