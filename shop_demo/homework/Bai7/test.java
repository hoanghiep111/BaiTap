package bu3_training.shop_demo.homework.Bai7;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Payment pm = new CreditCardPayment();
//        pm.process_payment(300);
//        Payment pm2 = new PayPalPayment();
//        pm2.process_payment(200);

        while (true){
            System.out.println("Nhập số lượng: ");
            double amount = scanner.nextDouble();

            System.out.println("Chọn phương thức thanh toán");
            System.out.println("1. Thanh toán bằng thẻ");
            System.out.println("2. Thanh toán bằng paypal");
            System.out.println("3. Hủy");
            System.out.println("Nhập lựa chọn: ");
            int luachon = scanner.nextInt();

            if(luachon == 1){
                CreditCardPayment cr = new CreditCardPayment();
                cr.process_payment(amount);
            }
            else if(luachon ==2)
            {
                PayPalPayment pp = new PayPalPayment();
                pp.process_payment(amount);
            }
            else if(luachon ==3){
                System.out.println("Hủy giao dịch");
                return;
            }
            else {
                System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
