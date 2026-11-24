package DesignPattern.AdapterDP;

class LegacyPaymentGateway {

    public void makePayment(double amount) {
        System.out.println(
                "Payment of " + amount
                        + " processed by legacy gateway."
        );
    }
}
