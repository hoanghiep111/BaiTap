package bu3_training.shop_demo.datatypes.quanlysinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> student = new ArrayList<>();

        System.out.println("Nhập số lượng sinh vin: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên " + name + ": ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            student.add(new Student(name, score));
        }

        System.out.println("Danh sách sinh viên: ");
        for (int i = 0; i< student.size(); i++){
            student.get(i).hienThiSinhVien();
        }
    }
}
