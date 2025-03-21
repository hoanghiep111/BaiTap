package bu3_training.shop_demo.oop.product;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String id,String name, double price, String category, int stock, String size, String material) {
        super(id,name, price, category, stock);
        this.size = size;
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
