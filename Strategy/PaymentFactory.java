import java.util.Scanner;

public class PaymentFactory {
    public static PaymentMethod selectPayment(){
        PaymentMethod toReturn;
        Scanner in = new Scanner(System.in);
        System.out.println("Select your payment method");
        System.out.println("1-Credit");
        System.out.println("2-Paypal");
        System.out.println("3-Crypto");
        switch (in.nextInt()) {
            case 1:
                toReturn = new CreditPayment();
                break;
            case 2:
                toReturn = new PaypalPayment();
                break;
            case 3:
                toReturn = new CryptoPayment();
                break;
        
            default:
                toReturn = null;
                break;
        }
        in.close();
        return toReturn;
    }
}
