package bu3_training.shop_demo.datatypes.qldanhsachbangArrayList;

import java.util.*;

public class QLDanhSach {
    private ArrayList<SinhVien> sinhViens;

    public QLDanhSach(){
        sinhViens = new ArrayList<>();
    }
    public void nhapTenVaDiem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập điểm sinh viên: ");
        double diem = scanner.nextDouble();
        SinhVien sv = new SinhVien(ten,diem);
        sinhViens.add(sv);
    }

//    public void addSinhVien(SinhVien sinhVien){
//        sinhViens.add(sinhVien);
//    }

    public void hienThiDanhSachSinhVien() {
        System.out.println("\nDanh sách sinh viên:");
        if (sinhViens.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (int i = 0; i < sinhViens.size(); i++) {
            SinhVien sinhVien = sinhViens.get(i);
            System.out.println("Tên sinh viên: " + sinhVien.getTen());
            System.out.println("Điểm sinh viên: " + sinhVien.getDiem());
        }
    }

    public void sinhVienCoDiemCaoNhat(){
        if (sinhViens.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        SinhVien diemMax = sinhViens.get(0);
        for(int i =1; i< sinhViens.size(); i++){
            if(sinhViens.get(i).getDiem()> diemMax.getDiem()){
                diemMax = sinhViens.get(i);
            }
        }
        System.out.println("Sinh viên " + diemMax.getTen() + "  có điểm cao nhất " + diemMax.getDiem());
    }

////Sắp xếp danh sách theo số điểm giảm dần!
//        Collections.sort(danhSach, new Comparator<SinhVien>() {
//        @Override
//        public int compare(SinhVien sv1, SinhVien sv2) {
//            if (sv1.diem < sv2.diem) {
//                return 1;
//            } else {
//                if (sv1.diem == sv2.diem) {
//                    return 0;
//                } else {
//                    return -1;
//                }
//            }
//        }
//    });
//
//        System.out.println("Danh sách sắp xếp theo thứ tự điểm giảm dần là: ");
//        for (int i = 0; i < danhSach.size(); i++) {
//        System.out.println("Tên: " + danhSach.get(i).hoTen + " Điểm: " + danhSach.get(i).diem);
//    }

    public void sapXepDiemGiamDan(){
        Collections.sort(sinhViens, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getDiem() < o2.getDiem()) {
                    return 1;
                } else if (o1.getDiem() == o2.getDiem()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm giảm dần:");
        hienThiDanhSachSinhVien();

    }
}
