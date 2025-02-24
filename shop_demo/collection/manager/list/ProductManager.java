package bu3_training.shop_demo.collection.manager.list;

import bu3_training.shop_demo.collection.models.Product;
import bu3_training.shop_demo.datatypes.qldanhsachbangArrayList.SinhVien;
import org.hibernate.sql.ast.tree.expression.Collation;

import java.util.*;

public class ProductManager {
    private ArrayList<Product> products;
    private HashSet<Product> productSet;
    private HashMap<String,Integer> productStock;

    public ProductManager(){
        products = new ArrayList<>();
        productSet = new HashSet<>();
        productStock = new HashMap<>();

    }

    // Phương thức thêm sp
    public void addProduct(Product product, String productId ){
        productId = String.valueOf(product.getId());
        if (productSet.contains(product)) { // Kiểm tra trùng ID trong HashSet
            System.out.println("Sản phẩm với ID " + product.getId() + " đã tồn tại!");
            return;
        }
        productSet.add(product); // Thêm vào HashSet để đảm bảo không trùng
        products.add(product);
        productStock.put(productId, product.getStock()); // Lưu số lượng vào HashMap
    }

    // phương thức xóa sản phẩm
    public void removeProduct(String productId){
            for(int i =0; i< products.size(); i++){
                if(products.get(i).getId().equals(productId)){
                    products.remove(i);
                    productSet.remove(products.get(i));
                    productStock.remove(productId);
                    return;
                }
            }
    }

    // Phương thức cập nhật số lượng sản phẩm
    public void updateStock(String productId, int newStock) {
        if (productStock.containsKey(productId)) {
            productStock.put(productId, newStock);
            for (Product p : products) { // Cập nhật danh sách sản phẩm
                if (p.getId().equals(productId)) {
                    p.setStock(newStock);
                    break;
                }
            }
            System.out.println("Cập nhật số lượng sản phẩm " + productId + " thành " + newStock);
        } else {
            System.out.println("Không tìm thấy sản phẩm với id " + productId);
        }
    }

    // hiển thị số lượng sản phẩm
    public void displayProductStock() {
        for (String productId : productStock.keySet()) {
            System.out.println("Sản phẩm ID: " + productId + " có số lượng: " + productStock.get(productId));
        }
    }

    // phương thực hiển thị danh sách
    public void displayList(){
        for(int i= 0; i< products.size(); i++){
            System.out.println("ID: " + products.get(i).getId());
            System.out.println("Tên : " + products.get(i).getName());
            System.out.println("Gía: " + products.get(i).getPrice());
            System.out.println("Loại: " + products.get(i).getCategory());
            System.out.println("Kho: " + products.get(i).getStock());
        }
    }

    // Phương thức tìm kiếm sp giá cao nhất
    public void foundProductMax(){
        if (products.isEmpty()) {
            System.out.println("Danh sách sp trống.");
            return;
        }
        Product hightProduct = products.get(0);
        for(int i =1; i< products.size(); i++){
            if(products.get(i).getPrice() > hightProduct.getPrice()){
                hightProduct = products.get(i);
            }
        }
        System.out.println("Sản phẩm " + hightProduct.getName() + "  có giá cao nhất " + hightProduct.getPrice());
    }

    // phương thức lọc sản phẩm theo loại
    public ArrayList<Product> filteredProductsByCategory(String category) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for(int i =0; i< products.size(); i++){
            if(products.get(i).getCategory().equalsIgnoreCase(category)){// k phân biệt hoa - thường
                filteredProducts.add(products.get(i));
            }
        }
        return filteredProducts;
    }

    // sắp xếp giá tăng dần
    public void priceIncrease(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                if(o1.getPrice()==o2.getPrice()){
                    return 0;
                }
                else
                    return -1;
            }
        });
    }

    // Tất cả danh mục sản phẩm
    public TreeSet<String> allCategories() {
        TreeSet<String> categorySet = new TreeSet<>();
        for (int i = 0; i < products.size(); i++) {
            categorySet.add(products.get(i).getCategory());
        }
        return categorySet;
    }

}
