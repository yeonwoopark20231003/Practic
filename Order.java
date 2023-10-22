package Practic;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> orderedProduct;

    public Order() {
        this.orderedProduct = new ArrayList<>();
    }

    public void addProduct(Product product){
        orderedProduct.add(product);
    }
}
