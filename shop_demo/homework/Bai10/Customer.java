package bu3_training.shop_demo.homework.Bai10;

import java.util.Arrays;
import java.util.Scanner;

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
    @Override
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Customer Menu ---");
            System.out.println("1. Mua hàng");
            System.out.println("2. Viết đánh giá");
            System.out.println("3. Đăng xuất");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    mua();
                    break;
                case 2:
                    review();
                    break;
                case 3:
                    System.out.println("Đăng xuất Customer...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
