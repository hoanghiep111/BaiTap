package bu3_training.shop_demo.datatypes;

import java.util.Scanner;

public class PhutDoiSangNgayVaNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soPhutTrongNgay = 24*60;
        double motNam = 365*soPhutTrongNgay;

        System.out.print("Nhập số phút: ");
        double phut = scanner.nextDouble();
        double ngay = phut/soPhutTrongNgay;
        int roundNgay = (int) ngay;
        System.out.print("Từ phút sang ngày: "+ roundNgay);

        double soNam = phut/motNam;
        int roundNam = (int) soNam;
        System.out.println("Từ phút sang năm: "+ roundNam);










    }
}
