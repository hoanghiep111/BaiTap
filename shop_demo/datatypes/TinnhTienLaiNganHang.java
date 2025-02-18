package bu3_training.shop_demo.datatypes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TinnhTienLaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        BigDecimal P = scanner.nextBigDecimal();

        System.out.print("Nhập lãi xuất hàng năm: ");
        BigDecimal r = scanner.nextBigDecimal();

        System.out.print("Nhập số năm gửi: ");
        int n = scanner.nextInt();


        BigDecimal onePlusR = BigDecimal.ONE.add(r); //(1+r)
        BigDecimal A = P.multiply(onePlusR.pow(n)); //ngũ

        System.out.println("Tổng tiền sau " + n + " năm: " + A.setScale(2, RoundingMode.HALF_UP));




    }
}
