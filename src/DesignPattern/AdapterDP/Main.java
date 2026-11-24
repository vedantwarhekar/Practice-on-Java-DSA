package DesignPattern.AdapterDP;

public class Main {

    public static void main(String[] args) {

        LegacyPaymentGateway gateway =
                new LegacyPaymentGateway();

        PaymentProcessor processor =
                new PaymentAdapter(gateway);

        processor.pay(500);
    }
}
