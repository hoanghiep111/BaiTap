package bu3_training.shop_demo.collection.models;

import java.util.List;
import java.util.Objects;

public class Order {
    private int orderId;
    private String user;
    private List<bu3_training.shop_demo.collection.models.Product> products;
    private double totalPrice;
    private String status;

    public Order(int orderId, String user, List<bu3_training.shop_demo.collection.models.Product> products, double totalPrice) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.totalPrice = totalPrice;
        this.status = "Đang xử lý";
    }

    public int getOrderId() {
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

    public List<bu3_training.shop_demo.collection.models.Product> getProducts() {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(orderId);
    }
}
