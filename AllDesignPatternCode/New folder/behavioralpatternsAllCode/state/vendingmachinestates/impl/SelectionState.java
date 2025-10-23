package com.conceptcoding.behavioralpatterns.state.vendingmachinestates.impl;

import com.conceptcoding.behavioralpatterns.state.context.Product;
import com.conceptcoding.behavioralpatterns.state.context.VendingMachine;
import com.conceptcoding.behavioralpatterns.state.vendingmachinestates.VendingMachineState;

import java.util.Optional;

// Step 2b: Concrete State - SelectionState
// When the customer is selecting a product
public class SelectionState extends VendingMachineState {

    @Override
    public void chooseProduct(VendingMachine vendingMachine, String productCode) throws Exception {
        System.out.println("CurrentState: " + vendingMachine.getCurrentState().getClass().getSimpleName());
        System.out.println("Product Selection in progress...");
        System.out.println("Product selected: " + productCode);
        Optional<Product> selectedProduct = vendingMachine.getInventory()
                .stream()
                .filter(product -> product.getProductCode().equals(productCode)).findFirst();
        if (selectedProduct.isEmpty()) {  // Wrong Product Code
            vendingMachine.setCurrentState(new IdleState());
            throw new Exception("WRONG PRODUCT CODE: The product code is invalid. Please enter the correct code.");
        }
        if (selectedProduct.get().getQuantity() == 0) { // Out of Stock
            vendingMachine.setCurrentState(new IdleState());
            throw new Exception("OUT OF STOCK: The product is out of stock. Please select another product.");
        }
        vendingMachine.setSelectedProduct(selectedProduct.get());
        vendingMachine.setCurrentState(new CollectMoneyState());
    }
    
}

