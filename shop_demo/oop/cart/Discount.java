package bu3_training.shop_demo.oop.cart;

import bu3_training.shop_demo.oop.product.Product;

public class Discount {
    public void applyDiscount(Product product, double percentage){
        if (percentage < 0 || percentage > 100) {
            System.out.println("Phần trăm giảm giá không hợp lệ!");
            return;
        }
        double giaMoi = product.getPrice() * (1 - percentage / 100);
        product.setPrice(giaMoi);
        System.out.println("Đã áp dụng giảm giá " + percentage + "% cho sản phẩm: " + product.getName());
    }

    public double appBulkDiscount(Cart cart){
        int toiDa = 100;
        int phanTram = 10;
        double total = cart.getTotalPrice();

        if (total > toiDa) {
            return total * (1 - phanTram / 100);
        }
        return total;

    }
}
