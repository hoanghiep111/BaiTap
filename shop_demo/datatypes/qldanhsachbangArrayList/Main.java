package bu3_training.shop_demo.datatypes.qldanhsachbangArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLDanhSach qlDanhSach = new QLDanhSach();

        while(true){
            System.out.println("Danh sách sinh viên ");
            System.out.println("1.Nhập vào danh sách sinh viên gồm tên và điểm số");
            System.out.println("2.In danh sách sinh viên");
            System.out.println("3.Tìm sinh viên có điểm cao nhất");
            System.out.println("4.Sắp xếp danh sách theo điểm giảm dần");
            System.out.println("5. Thoát ");

            System.out.println("Chọn");
            int luachon = scanner.nextInt();
            scanner.nextLine();

            switch (luachon){
                case 1:
                    qlDanhSach.nhapTenVaDiem();
                    break;
                case 2:
                    qlDanhSach.hienThiDanhSachSinhVien();
                    break;
                case 3:
                    qlDanhSach.sinhVienCoDiemCaoNhat();
                    break;
                case 4:
                    qlDanhSach.sapXepDiemGiamDan();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}
