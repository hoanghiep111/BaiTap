package bu3_training.shop_demo.homework.Bai7;

public class CreditCardPayment extends Payment{

    @Override
    public void process_payment(double amount) {
        System.out.println("Thanh toán qua thẻ tín dụng: "+ amount);
    }
}
