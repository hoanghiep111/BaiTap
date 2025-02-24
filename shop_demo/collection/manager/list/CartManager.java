package bu3_training.shop_demo.collection.manager.list;

import bu3_training.shop_demo.collection.models.Product;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CartManager {
    private LinkedList<Product> cartItems;
    private HashMap<Product, Integer> cart;

    public CartManager(){
        cartItems = new LinkedList<>();
        cart = new HashMap<>();
    }

    // Thêm sản phẩm vào giỏ hàng
    public void addProduct(Product product, int quantity){
        cartItems.add(product);
        if (cart.containsKey(product)) {
            cart.put(product, cart.get(product) + quantity);
        } else {
            cart.put(product, quantity);
        }
    }

    // xóa sản phẩm trong giỏ hàng
    public void removeProdcut(String productId){
        for(int i=0; i< cartItems.size(); i++){
            if(cartItems.get(i).getId().equals(productId)){
                cartItems.remove(i);
                cart.remove(cartItems.get(i));
            }
        }
    }

    // hiển thị giỏ hàng
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng trống!");
            return;
        }
        System.out.println("Giỏ hàng:");
        for (Product product : cart.keySet()) {
            System.out.println(product.getName() + " Số lượng: " + cart.get(product));
        }
    }


    // Lấy sản phẩm đầu tiên
    public void firstProduct(){
        if(cartItems.isEmpty()){
            System.out.println("Không có sản phẩm trong giỏ");
        }
        else
        {
            System.out.println("Sản phẩm đầu tiên: " + cartItems.getFirst());
        }
    }


    // lấy sản phẩm cuối cùng
    public void lastProduct(){
        if(cartItems.isEmpty()){
            System.out.println("Không có sản phẩm trong giỏ");
        }
        else
        {
            System.out.println("Sản phẩm cuối tiên: " + cartItems.getLast());
        }
    }


}
