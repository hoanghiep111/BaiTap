package bu3_training.shop_demo.oop.cart;

public class PayPalPayment extends Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán qua thẻ PayPal: "+ amount);

    }
}
