package bu3_training.shop_demo.homework.Bai9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("P001", "Laptop Dell", 10));

        while (true){
            System.out.println(" QUẢN LÝ KHO ");
            System.out.println("1. Kiểm tra tồn kho");
            System.out.println("2. Nhập thêm hàng");
            System.out.println("3. Xuất khi có hóa đơn");
            System.out.println("4. Thoát");

            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhập id sản phẩm");
                    String check = scanner.nextLine();
                    inventory.checkStock(check);
                    break;
                case 2:
                    System.out.print("Nhập id sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm mới: ");
                    String productName = scanner.nextLine(); // Nhập tên sản phẩm
                    System.out.print("Nhập số lượng xuất: ");
                    int quantity = scanner.nextInt();

                    inventory.restock(id,productName, quantity);
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm: ");
                    String deductId = scanner.nextLine();
                    System.out.print("Nhập số lượng xuất: ");
                    int deductQuantity = scanner.nextInt();
                    inventory.deductStock(deductId, deductQuantity);
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Không hợp lệ");

            }

        }

    }
}
