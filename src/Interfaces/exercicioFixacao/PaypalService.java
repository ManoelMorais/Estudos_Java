package Interfaces.exercicioFixacao;

public class PaypalService implements OnlinePaymentService {

    private static final double TAX_PAYMENT = 0.02;
    private static final double TAX = 0.01;

    @Override
    public Double paymentFee(double amount) {
        return amount * TAX_PAYMENT;
    }

    @Override
    public Double interest(double amount, int months) {
        return amount * TAX * months;
    }
}
