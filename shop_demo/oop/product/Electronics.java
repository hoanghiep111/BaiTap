package bu3_training.shop_demo.oop.product;

public class Electronics extends Product{
    private String brand;
    private int warranty;

    public Electronics(String id,String name, double price, String category, int stock, String brand, int warranty) {
        super(id, name, price, category, stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty + " months");
    }
}
