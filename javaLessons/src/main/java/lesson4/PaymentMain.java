package lesson4;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("product1", 5.99);
        payment.addProduct("product2", 10.99);
        payment.addProduct("product3", 15.99);

        payment.showProducts();
    }
}
