package bu3_training.shop_demo.oop.inventory;



import bu3_training.shop_demo.oop.product.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> productList;

    public Inventory() {
        this.productList = new HashMap<>();
    }

    public void checkStock(String productId) {
        Product product = productList.get(productId);
        if (product != null) {
            System.out.println("Sản phẩm: " + product.getName() + " có số lượng trong kho còn: " + product.getStock());
        } else {
            System.out.println("Sản phẩm không còn!");
        }
    }

    public void addProduct(Product product) {
        productList.put(product.getId(), product);
    }

    public void resTock(String productId,String productName, int quantity ){
        Product product = productList.get(productId);
        if (product != null) {
            product.setStock(product.getStock()+ quantity);
            System.out.println("Đã thêm " + quantity + " sản phẩm " + product.getName() + ". Tổng tồn kho: " + product.getStock());
        } else {
            product = new Product(productId,productName , quantity);
            productList.put(productId, product);
            System.out.println("Sản phẩm mới đã thêm vào kho: " + product.getName() + " với số lượng: " + quantity);
        }
    }

    public void deductStock(String productId, int quantity) {
        Product product = productList.get(productId);
        if (product != null) {
            if (product.getStock() >= quantity) {
                product.setStock(product.getStock() - quantity);
                System.out.println("Xuất " + quantity + " sản phẩm " + product.getName() + ". Tồn kho còn lại: " + product.getStock());
            } else {
                System.out.println("Không đủ hàng trong kho!");
            }
        } else {
            System.out.println("Sản phẩm không tồn tại!");
        }
    }
}
