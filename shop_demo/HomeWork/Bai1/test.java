package bu3_training.shop_demo.HomeWork.Bai1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập loại sản phẩm: ");
        String loai = scanner.nextLine();
        System.out.println("Số lượng sản phẩm: ");
        int soLuong = scanner.nextInt();

        Product pr = new Product(name,price,loai,soLuong);
        pr.hienThiThongTin();
    }

}
