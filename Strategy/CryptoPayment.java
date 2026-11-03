public class CryptoPayment implements PaymentMethod{
    @Override
    public void pay(double value) {
        System.out.println("The value of " + value + " was paid by crypto");
    }
}
