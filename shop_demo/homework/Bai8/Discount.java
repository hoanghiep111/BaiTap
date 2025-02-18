package bu3_training.shop_demo.homework.Bai8;

public class Discount {
    public void applyDiscount(Productt product, double percentage){
        if (percentage < 0 || percentage > 100) {
            System.out.println("Phần trăm giảm giá không hợp lệ!");
            return;
        }
        double giaMoi = product.getPrice() * (1 - percentage / 100);
        product.setPrice(giaMoi);
        System.out.println("Đã áp dụng giảm giá " + percentage + "% cho sản phẩm: " + product.getName());
    }

    public double appBulkDiscount(Cart cart){
        int toida = 100;
        int phanTram = 10;
        double total = cart.total_price();

        if (total > toida) {
            return total * (1 - phanTram / 100);
        }
        return total;

    }
}
