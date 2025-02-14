package bu3_training.shop_demo.HomeWork.Bai3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private List<Double> quantity;

    public Cart() {
        products = new ArrayList<>();
        quantity = new ArrayList<Double>();
    }

    public void add_product(Product product, double quantitys){
        products.add(product);
        quantity.add(quantitys);
    }
    public void remove_product(String product) {
        for(int i =0; i< products.size(); i++){
            if(products.get(i).getId().equals(product)){
                products.remove(i);
                quantity.remove(i);
                break;
            }
        }
    }
    public double get_total_price() {
        double tong  = 0;
        for(int i = 0; i< products.size(); i++){
            tong += products.get(i).getPrice() * quantity.get(i);
        }
        return tong;
    }

    // Hiển thị sản phẩm trong giỏ hàng
    public void hienThiDanhSach() {
        System.out.println("\nDanh sách sản phẩm trong giỏ hàng:");
        if (products.isEmpty()) {
            System.out.println("Giỏ hàng trống.");
            return;
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Id: " + products.get(i).getId());
            System.out.println("Tên: " + products.get(i).getName());
            System.out.println("Gía: " + products.get(i).getPrice());
            System.out.println("Số lượng: " + quantity.get(i));
        }
    }


}
