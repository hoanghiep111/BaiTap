package bu3_training.shop_demo.homework.Bai6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thông tin Electronics:");
        System.out.print("Tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Gía sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Hãng: ");
        String brand = scanner.nextLine();
        System.out.print("Bảo hành: ");
        int warranty = scanner.nextInt();
        scanner.nextLine();

        Product product1 = new Electronics(name, price, brand, warranty);


        System.out.println("Thông tin Clothing:");
        System.out.print("Tên sản phẩm: ");
        name = scanner.nextLine();
        System.out.print("Gía sản phẩm: ");
        price = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng trống
        System.out.print("Size: ");
        String size = scanner.nextLine();
        System.out.print("Chất liệu: ");
        String material = scanner.nextLine();

        Product product2 = new Clothing(name, price, size, material);

        System.out.println("Hiển thị thông tin Electronics :");
        product1.hienThiThongTin();

        System.out.println("Hiển thị thông tin Clothing:");
        product2.hienThiThongTin();


    }
}
