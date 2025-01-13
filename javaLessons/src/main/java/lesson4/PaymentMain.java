package lesson4;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("хлеб", 5.99);
        payment.addProduct("чай", 10.99);
        payment.addProduct("салат", 15.99);

        payment.showProducts();
    }
}
