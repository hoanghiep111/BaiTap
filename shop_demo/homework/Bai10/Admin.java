package bu3_training.shop_demo.homework.Bai10;

import java.util.Arrays;
import java.util.Scanner;

public class Admin extends User{
    public Admin(String id, String username, String password) {
        super(id, username, password, "Admin",  Arrays.asList("ADD_PRODUCT", "MANAGE_ORDERS"));
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
    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Admin Menu");
            System.out.println("1. Quản lý sản phẩm");
            System.out.println("2. Quản lý đơn hàng");
            System.out.println("3. Đăng xuất");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageProducts();
                    break;
                case 2:
                    manageOrders();
                    break;
                case 3:
                    System.out.println("Đăng xuất ");
                    return;
                default:
                    System.out.println(" Lựa chọn không hợp lệ!");
            }
        }
    }
}
