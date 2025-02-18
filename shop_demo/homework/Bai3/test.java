package bu3_training.shop_demo.homework.Bai3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//        System.out.println("Nhập số lượng sản phẩm: ");
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
//
//            System.out.println("Nhập id sản phẩm ");
//            String id = scanner.nextLine();
//
//            System.out.println("Nhập tên sản phẩm ");
//            String name = scanner.nextLine();
//
//            System.out.println("Nhập giá sản phẩm ");
//            double price = scanner.nextDouble();
//            scanner.nextLine();
//
//            System.out.println("Số lượng sản phẩm ");
//            double quantity = scanner.nextDouble();
//            scanner.nextLine();
//
//            Product pr = new Product(id, name, price);
//            cart.add_product(pr, quantity);
//        }
//
//        cart.hienThiDanhSach();
//        System.out.println("Tổng giá trong giỏ hàng: " + cart.get_total_price());
//
//        System.out.println("Nhập id sản phẩm xóa: ");
//        String idxoa = scanner.nextLine();
//        cart.remove_product(idxoa);
//        System.out.println("Tổng giá trong giỏ hàng: " + cart.get_total_price());
//
//        System.out.println("Danh sách còn ");
//        cart.hienThiDanhSach();
//
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        while (true) {
            System.out.println("QL giỏ hàng");
            System.out.println("1.Thêm sản phẩm vào giỏ hàng");
            System.out.println("2.Xóa sản phẩm trong giỏ hàng");
            System.out.println("3.Tính tổng tiền trong giỏ hàng");
            System.out.println("4.Hển thị trong giỏ hàng");
            System.out.println("5. Thoát ");

            System.out.println("Chọn");
            int luachon = scanner.nextInt();
            scanner.nextLine();

            switch (luachon) {
                case 1:
                    System.out.print("Nhập id sản phẩm ");
                    String id = scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Số lượng sản phẩm ");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine();

                    Product pr = new Product(id, name, price);
                    cart.add_product(pr, quantity);
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm xóa: ");
                    String idxoa = scanner.nextLine();
                    cart.remove_product(idxoa);
                    break;
                case 3:
                    System.out.println("Tổng giá trong giỏ hàng: " + cart.get_total_price());
                    break;
                case 4:
                    System.out.println("SP trong giỏ hàng là: ");
                    cart.hienThiDanhSach();
                    break;
                case 5:
                    System.out.println("Thoát");
                    return;
                default:
                    System.out.println("Không hợp lệ");
                    break;

            }
        }


    }
}
