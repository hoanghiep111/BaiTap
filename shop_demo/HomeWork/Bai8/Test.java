package bu3_training.shop_demo.HomeWork.Bai8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        Discount dc = new Discount();

        while(true){
            System.out.println("menu");
            System.out.println("1. Thêm sản phẩm vào giỏ hàng");
            System.out.println("2. Hiển thị giỏ hàng");
            System.out.println("3. Áp dụng giảm giá cho sản phẩm");
            System.out.println("4. Áp dụng giảm giá cho giỏ hàng");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();

                    Productt product = new Productt(id,name,price);
                    cart.add_product(product);
                    System.out.println("Thêm sản phẩm vào giỏ hàng!");
                    break;
                case 2:
                    cart.hienThiDanhSach();
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần giảm giá: ");
                    String productId = scanner.nextLine();
                    System.out.print("Nhập phần trăm giảm giá: ");
                    double discountPercentage = scanner.nextDouble();

                    Productt foundProduct = null;
                    for (Productt p : cart.getProducts()) {
                        if (p.getId().equals(productId)) {
                            foundProduct = p;
                            break;
                        }
                    }
                    if (foundProduct != null) {
                        dc.applyDiscount(foundProduct, discountPercentage);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm!");
                    }
                    break;

                case 4 :
                    double newTotal = dc.appBulkDiscount(cart);
                    System.out.println("Tổng giá trị sau khi áp dụng giảm giá: " + newTotal);
                    break;
                case 5 :
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");

            }
        }

    }

}
