package bu3_training.shop_demo.oop.cart;

import bu3_training.shop_demo.homework.Bai4.Product;

import java.util.List;

public class Order {
    private int orderId;
    private String user;
    private List<Product> products;
    private double totalPrice;
    private String status;

    public Order(int orderId, String user, List<Product> products, double totalPrice) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = "Đang xử lý";
    }

    public int getOrder_id() {
        return orderId;
    }

    public void setOrder_id(int orderId) {
        this.orderId = orderId;
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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
            System.out.println("✔ Trạng thái đơn hàng " + orderId + " cập nhật thành: " + trangThaiMoi);
        } else {
            System.out.println(" Trạng thái không hợp lệ!");
        }
    }

}
