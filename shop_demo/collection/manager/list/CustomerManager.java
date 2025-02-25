package bu3_training.shop_demo.collection.manager.list;

import bu3_training.shop_demo.collection.models.Product;
import bu3_training.shop_demo.collection.models.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CustomerManager {
    private HashSet<User> customer;
    private HashMap<String, Integer> customerPurchaseCount;

    public CustomerManager(){
        customer = new HashSet<>();
        customerPurchaseCount = new HashMap<>();

    }

    public void addUser(User user){
        customer.add(user);
    }

    // Kiểm tra email tồn tại chưa
    public boolean isEmailExists(String email){
        for (User user : customer) { // Duyệt từng khách
            if (user.getEmail().equals(email)) {
                System.out.println("Email đã tồn tại " + email);
                return true;
            }
        }
        return false;
    }
    public void display() {
        for (User user : customer) {
            System.out.println("ID: " + user.getId());
            System.out.println("Tên: " + user.getUsername());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Vai trò: " + user.getRole());
            System.out.println("Quyền hạn: " + user.getPermissions());
        }
    }

    // Kiểm tra sản phẩm có trong danh sách yêu thích của khách hàng không
    public boolean isProductInFavorites(String userId, Product product) {
        for (User user : customer) {
            if (user.getId().equals(userId)) {
                return user.isFavorite(product);
            }
        }
        return false;
    }

    // Thống kê số lần mua hàng của từng khách hàng
    public void recordPurchase(String customerID) {
        if (customerPurchaseCount.containsKey(customerID)) {
            customerPurchaseCount.put(customerID, customerPurchaseCount.get(customerID) + 1);
        } else {
            customerPurchaseCount.put(customerID, 1);
        }
    }

    // in số lần mua hàng của khách hàng
    public void displayPurchase() {
        for (String customerID : customerPurchaseCount.keySet()) {
            int count = customerPurchaseCount.get(customerID);
            System.out.println("Khách hàng " + customerID + " đã mua hàng " + count + " lần.");
        }

    }

}
