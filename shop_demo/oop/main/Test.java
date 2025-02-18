package bu3_training.shop_demo.oop.main;

import bu3_training.shop_demo.oop.product.Clothing;
import bu3_training.shop_demo.oop.product.Electronics;
import bu3_training.shop_demo.oop.product.Product;
import bu3_training.shop_demo.oop.product.Review;
import bu3_training.shop_demo.oop.user.Admin;
import bu3_training.shop_demo.oop.user.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Admin admin = new Admin("A01", "admin01", "adminpass", "Admin", Arrays.asList("ADD_PRODUCT", "MANAGE_ORDERS"));
        Customer customer1 = new Customer("C01", "customer01", "custpass");


        System.out.println("Admin đang quản lý:");
        admin.manageProducts();
        admin.manageOrders();

        System.out.println("Customer thử mua hàng và viết đánh giá:");
        customer1.mua();
        customer1.review();


        // Tạo danh sách sản phẩm
        List<Product> productList = new ArrayList<>();

        productList.add(new Electronics("Laptop Dell XPS", 1500.00, "Electronics", 10, "Dell", 24));
        productList.add(new Clothing("Quần jean nam", 40.00, "Clothing", 30, "L", "Vai cotton"));

        System.out.println("Danh sách sản phẩm:");
        for (Product product : productList) {
            product.hienThiThongTin();
        }


        // Danh sách đánh giá
        List<Review> reviews = new ArrayList<>();

        reviews.add(new Review("User1", "Laptop Dell XPS", 5, "Sản phẩm rất tốt, pin trâu!"));

        for (Review review : reviews) {
            review.hienThiComment();
        }


    }
}
