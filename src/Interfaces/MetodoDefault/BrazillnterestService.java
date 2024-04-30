package Interfaces.MetodoDefault;

import java.security.InvalidParameterException;

public class BrazillnterestService implements InteretService {
    private double interestRate;

    public BrazillnterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
