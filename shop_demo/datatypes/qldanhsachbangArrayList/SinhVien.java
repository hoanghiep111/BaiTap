package bu3_training.shop_demo.datatypes.qldanhsachbangArrayList;

public class SinhVien {
    private String ten ;
    private double diem ;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", diem=" + diem +
                '}';
    }
}
