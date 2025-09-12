package LLDApplication.ShoppingCart.Model;
import java.util.Map;
import java.util.HashMap;
public class ProductController {
    private Map<Integer, Product> products; // productId v/s product
    public ProductController(){
        products = new HashMap<>();
    }

    public void addProduct(int productId, Product product){
        products.put(productId, product);

        System.out.println("Successfully added => "+"Product Name: "+product.getName()+" | Quantity: "+product.getQuantity());
        System.out.println("_______________________________________________");
    }

    public void removeProduct(int productId, Product product){
        products.remove(productId);
    }

    public void decreaseProductQuantity(int productId, int size){
        Product product=products.get(productId);
        int quantity = product.getQuantity();
        product.setQuantity(quantity-size);
    }

    public void increaseProductQuantity(int productId, int size){
        Product product=products.get(productId);
        int quantity = product.getQuantity();
        product.setQuantity(quantity+size);
    }

    public boolean isProductAvailable(int productId){
       if(products.containsKey(productId)){
        if(products.get(productId).getQuantity()==0){
            return false;
        }else{
            return true;
        }
       }
       return false;

    }

    public void allAvailableProductDetails(){
        System.out.println("Available products:");
        if(products.isEmpty()){
            System.out.println("No products available.");
            System.out.println("_______________________________________________");
            return;
        }
        boolean anyAvailable = false;
        for(Map.Entry<Integer, Product> entry : products.entrySet()){
            Product product = entry.getValue();
            if(product.getQuantity() > 0){
                anyAvailable = true;
                System.out.println(
                    "ProductId: " + entry.getKey() +
                    " | Name: " + product.getName() +
                    " | Quantity: " + product.getQuantity() +
                    " | Price: " + product.getPrice()
                );
            }
        }
        if(!anyAvailable){
            System.out.println("No products with non-zero quantity.");
        }
        System.out.println("_______________________________________________");
    }

    
    
}
