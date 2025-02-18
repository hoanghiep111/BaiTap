package bu3_training.shop_demo.datatypes;

import java.util.Scanner;

public class DoiInchSangMet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số inch: ");
        double inch = scanner.nextInt();
        double met = inch * 0.0254;
        System.out.println("Từ inch sang mét : " + String.format("%.4f",met));


        }

    }

