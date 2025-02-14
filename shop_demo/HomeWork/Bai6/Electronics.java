package bu3_training.shop_demo.HomeWork.Bai6;

public class Electronics extends Product{
    private String brand;
    private int warranty;

    public Electronics(String name, double price, String brand, int warranty) {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBranch() {
        return brand;
    }

    public void setBranch(String brand) {
        this.brand = brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
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
