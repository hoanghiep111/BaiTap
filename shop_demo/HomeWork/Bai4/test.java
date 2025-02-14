package bu3_training.shop_demo.HomeWork.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID đơn hàng: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        System.out.print("Nhập tên khách hàng: ");
        String user = scanner.nextLine();

        List<Product> productList = new ArrayList<>();
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        double tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1));
            System.out.println("Nhập id sản phẩm: ");
            int idsanPham = scanner.nextInt();
            scanner.nextLine();

            System.out.print("   Nhập tên sản phẩm: ");
            String tenSanPham = scanner.nextLine();

            System.out.print("   Nhập giá sản phẩm: ");
            double giaSanPham = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(idsanPham, tenSanPham, giaSanPham);
            productList.add(product);
            tong += giaSanPham;
        }
        Order order = new Order(orderId, user, productList, tong);
        order.hienThiDonHang();
        while (true) {
            System.out.println("\nChọn trạng thái đơn hàng mới:");
            System.out.println("1. Đang xử lý");
            System.out.println("2. Đã giao hàng");
            System.out.println("3. Đã hủy");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 4) break;

            switch (choice) {
                case 1:
                    order.capNhatTrangThai("Đang xử lý");
                    break;
                case 2:
                    order.capNhatTrangThai("Đã giao hàng");
                    break;
                case 3:
                    order.capNhatTrangThai("Đã hủy");
                    break;
                case 4:
                    return;
                default:
                    System.out.println(" Lựa chọn không hợp lệ!");
            }
            order.hienThiDonHang();
        }

    }
}
