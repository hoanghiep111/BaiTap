package bu3_training.shop_demo.oop.user;

import java.util.Arrays;
import java.util.List;

public class Customer extends User{

    public Customer(String id, String username, String password) {
        super(id, username, password, "Customer", Arrays.asList("MUA","REVIEW"));
    }
    public void mua() {
        if (kTraPermission("MUA")) {
            System.out.println("Mua hàng");
        }
    }
    public void review() {
        if (kTraPermission("REVIEW")) {
            System.out.println("Viết đánh giá");
        }
    }
}
