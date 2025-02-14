package bu3_training.shop_demo.HomeWork.Bai8;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Productt> products;

    public Cart(){
        this.products = new ArrayList<>();


    }

    public List<Productt> getProducts() {
        return products;
    }

    public void setProducts(List<Productt> products) {
        this.products = products;
    }


    public void add_product(Productt product){
        products.add(product);
    }

    public double total_price() {
        double tong  =0;
        for(int i = 0; i< products.size(); i++){
            tong += products.get(i).getPrice();
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
        }
    }
}
