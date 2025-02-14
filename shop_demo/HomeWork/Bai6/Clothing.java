package bu3_training.shop_demo.HomeWork.Bai6;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public void hienThiThongTin() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Material: " + material + " months");
    }
}
