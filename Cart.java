package Practic;


import Practic.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    ArrayList<Product> cartItem = new ArrayList<>();

    public void addCart (Product product){
        cartItem.add(product);
    }

    public void clearCart(){
        cartItem.clear();
    }

   // public ArrayList<Product> showCart()

    public ArrayList<Product> getCartItem() {
        return cartItem;
    }

    public void setCartItem(ArrayList<Product> cartItem) {
        this.cartItem = cartItem;
    }

    public int totalCartPrice(){
        int sum =0;
        for (int a=0; a<cartItem.size(); a++){
            sum += cartItem.get(a).getPrice();
        }return sum;
    }


  //  String addedNamePrice;
    StringBuilder addedNamePrice = new StringBuilder();
    public String showCart(){
        for (int a=0; a<cartItem.size();a++){
            addedNamePrice.append(cartItem.get(a).getName()).append(" | ").append(cartItem.get(a).getPrice()).append("원\n");

        }return addedNamePrice.toString();
    }


}
