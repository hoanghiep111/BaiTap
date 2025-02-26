package bu3_training.shop_demo.collection.main;

import bu3_training.shop_demo.collection.manager.list.CartManager;
import bu3_training.shop_demo.collection.manager.list.CustomerManager;
import bu3_training.shop_demo.collection.manager.list.OrderManager;
import bu3_training.shop_demo.collection.manager.list.ProductManager;
import bu3_training.shop_demo.collection.models.Order;
import bu3_training.shop_demo.collection.models.Product;
import bu3_training.shop_demo.collection.models.User;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        CartManager cartManager = new CartManager();
        CustomerManager customerManager = new CustomerManager();
        OrderManager orderManager = new OrderManager();

        // Thêm sản phẩm
        Product p1 = new Product("P001", "Laptop Dell", 1500.0, "Laptop", 10);
        Product p2 = new Product("P002", "MacBook Pro", 2500.0, "Máy", 5);
        Product p3 = new Product("P002", "Tai nghe", 200.0, "thiết bị", 5);
        Product p4 = new Product("P003", "  Điên thoại", 200.0, "Android", 5);

        // thêm sản phẩm
        productManager.addProduct(p1, p1.getId());
        productManager.addProduct(p2, p2.getId());
        productManager.addProduct(p3, p3.getId());
        productManager.addProduct(p4, p4.getId());

        // Thêm khách hàng vào danh sách
        System.out.println("------Thêm khách hàng vào danh sách");
        User user1 = new User("U001", "aaa", "aaa@example.com", "password123", "Customer", null);
        User user2 = new User("U002", "bbb", "bbb@example.com", "password456", "Customer", null);
        User user3 = new User("U003", "ccc", "ccc@example.com", "password789", "Customer", null);
        User user4 = new User("U004", "ddd", "aaa@example.com", "password000", "Customer", null); // Trùng email user1

        customerManager.addUser(user1);
        customerManager.addUser(user2);
        customerManager.addUser(user3);
        customerManager.addUser(user4);

        Order order1 = new Order(1,"aaa", Arrays.asList(p1, p2), 4000.0);
        Order order2 = new Order(2, "Bob", Arrays.asList(p4), 200.0);

        // Cập nhật trạng thái và thêm vào danh sách hoàn thành
        order1.capNhatTrangThai("Đã giao hàng");
        order2.capNhatTrangThai("Đang xử lý");




         // xóa sản phẩm trong danh sách
//          System.out.println("-----Xóa sản phẩm");
//          productManager.removeProduct(p1.getId());

        // hiển thị sản phẩm trong danh sách
        System.out.println("------Hiển thị danh sách sản phẩm");
        productManager.displayList();

        // sản phẩm giá trị cao nhất
        System.out.println("------Tìm sản phẩm có giá cao nhất");
        productManager.foundProductMax();

        // lọc theo danh mục
        System.out.println("------Lọc sản phẩm theo danh mục");
        for (Product p : productManager.filteredProductsByCategory("Laptop")) {
            System.out.println(p.getName() + " có giá " + p.getPrice());
        }

        // sắp xếp giá
        System.out.println("------Sắp xếp sắp phẩm theo giá");
        productManager.priceIncrease();

        // thêm sản phẩm vào giỏ
        System.out.println("------Thêm sản phẩm vào giỏ hàng");
        cartManager.addProduct(p1,2);
        cartManager.addProduct(p2,2);
        cartManager.addProduct(p4,1);
        cartManager.displayCart();

        // xoa sản phẩm trong giỏ hàng
        System.out.println("------Sau khi xóa sp trong giỏ hàng");
        cartManager.removeProdcut("P001");
        cartManager.displayCart();

        // Lấy sản phẩm đầu tiên
        System.out.println("-------Lấy sản phẩm đầu tiên");
        cartManager.firstProduct();

        // Lấy sản phẩm cuối cùng
        System.out.println("-------Lấy sản phẩm đầu tiên");
        cartManager.lastProduct();

        // Kiểm tra email đã tồn tại
        System.out.println("Kiểm tra email đã tồn tại chưa");
        customerManager.isEmailExists("aaa@example.com");

        System.out.println("Hiển thị danh sách khách hanng");
        customerManager.display();

        // tất cả danh mục sản phẩm
        System.out.println("Tất cả danh mục sản phẩm" + productManager.allCategories());


        // Thêm vào danh sách hoàn thành
        orderManager.completeOrder(order1);
        orderManager.completeOrder(order2);

        // Hiển thị danh sách đơn hàng hoàn thành
        orderManager.showCompletedOrders();

        // kiểm tra sản phẩm trong danh sách yêu thich
        System.out.println("Sản phẩm yêu thích: " +   customerManager.isProductInFavorites("U001",p1));

        // thống kê đơn mua hàng
        customerManager.recordPurchase("U001");
        System.out.println("Đơn mua");
        customerManager.displayPurchase();



    }
}
