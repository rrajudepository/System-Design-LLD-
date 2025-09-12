package LLDApplication.ShoppingCart.Model;
import java.util.LinkedList;
import java.util.List;
public class Cart {
     private List<CartItem> cartItems;
     private int limit;
     private int totalItems;
     public Cart(){
        cartItems = new LinkedList<>();
        limit =5;
        totalItems=0;
     }


     //Add product to the cart
     public void addCartItems(CartItem cartItem){
        Product product = cartItem.getProduct();
        int quantity = cartItem.getQuantity();
    


        System.out.println("We are proceeding to add "+product.getName());
        System.out.println("Total Items: "+totalItems+ " Qunatity: "+ quantity+" Limit: "+limit);

        if(product.getQuantity()<quantity){
            System.out.println("Product isn't availabe in this quantity");
        }else if(totalItems+quantity>limit){
            int quantity2= totalItems+quantity-limit;
            if(quantity2>0){
                System.out.println("You can add only"+quantity2+" "+product.getName());
                totalItems=limit;
                product.updateQuantity(product, -quantity2);
                cartItem.setQuantity(quantity2);
                cartItems.add(cartItem);
            }else{
                System.out.println("Limit of Cart exceed");
            }
        }else{
            totalItems+=quantity;
            product.updateQuantity(product, -quantity);
            cartItems.add(cartItem);
        }
        System.out.println("___________________________");
     }

     //Remove product from the cart
     public void removeItems(CartItem cartItem){
        for(CartItem Item : cartItems){
            if(Item == cartItem){
                cartItems.remove(Item);
                Product product = Item.getProduct();
                product.updateQuantity(product, cartItem.getQuantity());
                return;
            }
        }
        System.out.println("Item is not available on cart");
     }


    //View Items in cart
     public void viewItems(){
        System.out.println("Cart details : ");
        if(cartItems.size()==0){
            System.out.println("Cart is empty");
            return;
        }
        for(CartItem Item : cartItems){
            Product product = Item.getProduct();
            int quantity = Item.getQuantity();
            double cost = product.getPrice()*quantity;
            System.out.println("Product Name: " + product.getName()+" Quantity: "+quantity+ " Total Cost: "+cost);
        }
        System.out.println("____________________________________");
     }


    // Checkout 
     public double checkOut(){
        if(cartItems.size()==0){
            System.out.println("Cart is empty");
            return 0;
        }
        double cost =0.0;
        for(CartItem item : cartItems){
            Product product = item.getProduct();
            int quantity = item.getQuantity();
            cost += product.getPrice()*quantity;
        }
       return cost;
     }
}
