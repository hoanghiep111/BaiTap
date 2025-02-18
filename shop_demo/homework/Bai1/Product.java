package bu3_training.shop_demo.homework.Bai1;

public class Product {
    private String name;
    private double price ;
    private String category ;
    private int stock;

    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void hienThiThongTin(){
        System.out.println("Thông tin sản phẩm");
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Gía sản phẩm: " + price);
        System.out.println("Loại sản phẩm: " + category);
        System.out.println("Số lượng sản phẩm: " + stock);


    }
}
