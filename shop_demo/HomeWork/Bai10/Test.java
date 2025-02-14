package bu3_training.shop_demo.HomeWork.Bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static final List<User> users = new ArrayList<>();

    public static void main(String[] args) {

        users.add(new Admin("A001", "admin01", "admin123"));
        users.add(new Customer("C001", "customer01", "customer123"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("HỆ THỐNG QUẢN LÝ TÀI KHOẢN");
            System.out.print("Nhập username: ");
            String username = scanner.nextLine();
            System.out.print("Nhập password: ");
            String password = scanner.nextLine();

            // Tìm user
            User currentUser = null;
            for (User user : users) {
                if (user.login(username, password)) {
                    currentUser = user;
                    break;
                }
            }

            if (currentUser != null) {
                System.out.println(" Đăng nhập thành công! Chào " + currentUser.username);
                currentUser.showMenu();
            } else {
                System.out.println("Sai username hoặc password! Thử lại.");
            }
        }
    }

}
