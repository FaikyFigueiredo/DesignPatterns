import java.util.Random;

public class Hotel{
    
    private PaymentMethod pm;
    
    public void setPaymentMethod(){
        pm = PaymentFactory.selectPayment();
    }
    public void requestPayment(){
        if (pm == null){
            System.out.println("There's no payment method selected");
            return;
        }
        Random r = new Random();
        pm.pay(r.nextDouble() * 1000);
    }
}
