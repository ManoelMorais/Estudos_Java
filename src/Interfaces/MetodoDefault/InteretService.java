package Interfaces.MetodoDefault;

import java.security.InvalidParameterException;

public interface InteretService {
    double getInterestRate();

    default double payments(double amount, int monthers){
        if (monthers < 1){
            throw new InvalidParameterException("Monthers must be greater than 0");
        }

        return amount * Math.pow(1.0 + getInterestRate() / 100.0, monthers);
    }
}
