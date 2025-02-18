package bu3_training.shop_demo.homework.Bai5;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên khách hàng: ");
        String user = scanner.nextLine();

        System.out.print("Tên sản phẩm: ");
        String product = scanner.nextLine();

        System.out.print("Đánh giá (1 đến 5): ");
        int rating = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Bình luận khách hàng: ");
        String comment = scanner.nextLine();


        Review review = new Review(user, product, rating, comment);
        review.hienThiComment();
    }
}
