package bu3_training.shop_demo.oop.cart;


import bu3_training.shop_demo.oop.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private List<Double> quantity;

    public Cart() {
        products = new ArrayList<>();
        quantity = new ArrayList<Double>();
    }

    public void addProduct(Product product, double quantitys){
        products.add(product);
        quantity.add(quantitys);
    }
    public void removeProduct(String product) {
        for(int i =0; i< products.size(); i++){
            if(products.get(i).getId().equals(product)){
                products.remove(i);
                quantity.remove(i);
                break;
            }
        }
    }
    public double getTotalPrice() {
        double tong  = 0;
        for(int i = 0; i< products.size(); i++){
            tong += products.get(i).getPrice() * quantity.get(i);
        }
        return tong;
    }
}
