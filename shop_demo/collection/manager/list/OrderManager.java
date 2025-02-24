package bu3_training.shop_demo.collection.manager.list;

import bu3_training.shop_demo.collection.models.Order;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class OrderManager {
    private LinkedHashSet<Order> completedOrders;
    public OrderManager(){
        completedOrders = new LinkedHashSet<>();
    }

    // thêm đơn hàng hoàn thành vào danh sách hoàn thành
    public void completeOrder(Order order){
        if(order.getStatus().equals("Đã giao hàng")){
            completedOrders.add(order);
            System.out.println("Đơn hàng "+ order.getOrderId()+"đã hoàn thành giao hàng được thêm vào danh sách hoàn thành");
        }
        else {
            System.out.println("Đơn hàng "+ order.getOrderId()+ "chưa được giao");
        }
    }

    // Hiển thị danh sách đơn hàng đã hoàn thành
    public void showCompletedOrders() {
        System.out.println("Danh sách đơn hàng đã hoàn thành:");
        for (Order order : completedOrders) {
            System.out.println(" Đơn hàng" + order.getOrderId() + " của " + order.getUser());
        }
    }

}
