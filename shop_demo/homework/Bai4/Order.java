package bu3_training.shop_demo.homework.Bai4;

import java.util.List;

public class Order {
    private int order_id;
    private String user;
    private List<Product> products;
    private double total_price;
    private String status;

    public Order(int order_id, String user, List<Product> products, double total_price) {
        this.order_id = order_id;
        this.user = user;
        this.products = products;
        this.total_price = total_price;
        this.status = "Đang xử lý";
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void capNhatTrangThai(String trangThaiMoi){
        if (trangThaiMoi.equals("Đang xử lý") || trangThaiMoi.equals("Đã giao hàng") || trangThaiMoi.equals("Đã hủy")) {
            this.status = trangThaiMoi;
            System.out.println("✔ Trạng thái đơn hàng " + order_id + " cập nhật thành: " + trangThaiMoi);
        } else {
            System.out.println(" Trạng thái không hợp lệ!");
        }
    }

    public void hienThiDonHang(){
        System.out.println("--ĐƠN HÀNG--");
        System.out.println("Mã đơn hàng: " + order_id );
        System.out.println("Khách hàng: " + user );
        System.out.println("Danh sách sản phẩm: " );
        for (Product p : products) {
            System.out.println("   " + p);
        }
        System.out.println("Tổng giá: " + total_price );
        System.out.println("Trạng thái: " + status );
    }
}
