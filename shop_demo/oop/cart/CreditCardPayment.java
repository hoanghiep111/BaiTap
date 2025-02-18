package bu3_training.shop_demo.oop.cart;

public class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán qua thẻ tín dụng: "+ amount);
    }
}
