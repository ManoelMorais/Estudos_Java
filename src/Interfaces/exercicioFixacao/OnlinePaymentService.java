package Interfaces.exercicioFixacao;

public interface OnlinePaymentService {
    Double paymentFee(double amount);
    Double interest(double amount, int months);
}
