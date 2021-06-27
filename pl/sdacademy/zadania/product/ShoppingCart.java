package pl.sdacademy.zadania.product;

public class ShoppingCart {
    private Product[] products;

    public ShoppingCart(Product[] products) {
        this.products = products;
    }

    public int getTotalPrice() {
        int result = 0;
        for (Product product : products) {
            result += product.getPrice();
        }
   return result;
}

}
