package LLDApplication.ShoppingCart;
import LLDApplication.ShoppingCart.Model.Product;
import LLDApplication.ShoppingCart.Model.ProductController;
import LLDApplication.ShoppingCart.Model.CartItem;
import LLDApplication.ShoppingCart.Model.Cart;
public class Main {
    public static void main(String [] args){
        Product tv = new Product(1, "TV", 20000, 10);
        Product laptop = new Product(2,"Laptop", 50000, 5);
        Product iphone = new Product(3, "iPhone", 60000, 10);
        Product washingMachine = new Product(4, "Washing Machine", 15000, 5);

        ProductController productController = new ProductController();
        productController.addProduct(1, tv);
        productController.addProduct(2, laptop);
        productController.addProduct(3, iphone);
        productController.addProduct(4, washingMachine);

        CartItem itemWashingMachine = new CartItem(washingMachine,1);
        CartItem itemTV = new CartItem(tv, 1);
        CartItem itemLaptop = new CartItem(laptop, 2);
        CartItem itemiphone = new CartItem(iphone, 2);
        Cart cart = new Cart();
        cart.addCartItems(itemWashingMachine);
        cart.viewItems();
        cart.addCartItems(itemTV);
        cart.viewItems();
        cart.addCartItems(itemLaptop);
        cart.viewItems();
        cart.addCartItems(itemiphone);
        cart.viewItems();
        System.out.println("Total Cost of the products in cart is "+cart.checkOut());
        productController.allAvailableProductDetails();

    }    
}
