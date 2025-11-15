

public class MasterCard implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + "."
                + "оплата прошла успешно.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + "."
                + "возврат произведен");
    }
}
