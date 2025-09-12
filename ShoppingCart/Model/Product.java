package LLDApplication.ShoppingCart.Model;

public class Product {
    int productId;
    String name;
    double price;
    int quantity;
    
    // Constructor
    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters
    public int getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void updateQuantity(Product product, int quantity){
        int oldquantity = product.getQuantity();
        product.setQuantity(oldquantity+quantity); 
    }
}
