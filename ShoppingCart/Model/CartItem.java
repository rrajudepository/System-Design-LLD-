package LLDApplication.ShoppingCart.Model;

public class CartItem {
    private Product product;
    private int quantity;
    
    public CartItem(Product product){
        this.product = product;
        this.quantity = 0;
    }
    public CartItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    
    // Getters and Setters
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
