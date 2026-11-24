package DesignPattern.AdapterDP;

class PaymentAdapter implements PaymentProcessor {

    private final LegacyPaymentGateway gateway;

    public PaymentAdapter(LegacyPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(int amount) {
        gateway.makePayment(amount);
    }
}
