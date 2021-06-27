package pl.sdacademy.zadania.product;

public class Main {
    public static void main(String[] args) {

    Product product1 = new Milk(2,1,3);
        System.out.println("Cena pojedyńczej sztuki product1 [mleka]: " + product1.getPrice());
        System.out.println("Waga pojedyńczej sztuki product1 [mleka]: " + product1.getWeight());

        Product product2 = new ChocolateBar(2,100);
        System.out.println("Cena pojedyńczej sztuki product2 [batonik]:" + product2.getPrice());
        System.out.println("Waga pojedyńczej sztuki product2 [batonik]:" + product2.getWeight());


        System.out.println("\n ----------------Koszyk z zakupami------------------------------" );
       // ShoppingCart shoppingCart = new ShoppingCart(new Product[] {product1,product2});
        Product[] products = {product1,product2};
        ShoppingCart shoppingCart = new ShoppingCart(products);
        System.out.println("łączna cena produktów w koszyku: " + shoppingCart.getTotalPrice());
    }
}
