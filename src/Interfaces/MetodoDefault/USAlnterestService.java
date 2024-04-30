package Interfaces.MetodoDefault;

import java.security.InvalidParameterException;

public class USAlnterestService implements InteretService{
    private double interestRate;

    public USAlnterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
