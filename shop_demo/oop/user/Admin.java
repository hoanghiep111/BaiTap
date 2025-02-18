package bu3_training.shop_demo.oop.user;

import java.util.List;

public class Admin extends User{

    public Admin(String id, String username, String password, String role, List<String> permissions) {
        super(id, username, password, role, permissions);
    }
    public void manageProducts() {
        if (kTraPermission("ADD_PRODUCT")) {
            System.out.println("Quản lý sản phẩm");
        } else {
            System.out.println(" Bạn không có quyền quản lý sản phẩm!");
        }
    }
    public void manageOrders() {
        if (kTraPermission("MANAGE_ORDERS")) {
            System.out.println("Quản lý đơn hàng");
        } else {
            System.out.println("Bạn không có quyền quản lý đơn hàng!");
        }
    }
}
