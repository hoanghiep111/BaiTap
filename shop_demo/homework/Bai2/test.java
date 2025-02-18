package bu3_training.shop_demo.homework.Bai2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        String username = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập pass: ");
        String password = scanner.nextLine();

        Userr user = new Userr(username,email,password);

        System.out.println("Nhập mật khẩu: ");
        String nhapMatKhau = scanner.nextLine();

        if(user.checkout(nhapMatKhau)){
            System.out.println("Đăng nhập thành công:");
        }
        else
            System.out.println("Đăng nhập thất bại:");
    }
}
