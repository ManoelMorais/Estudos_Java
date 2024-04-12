package HerancaPolimorfismo;

public class Programa {
    public static void main(String[] args){

        Account01 acc = new Account01(1001, "Alex", 0.0);
        Account01 accX = new SavingsAccount(1020, "Marcos", 1000.0, 0.01);
        BusinessAccount01 accY = new BusinessAccount01(1002, "Maria", 0.0, 500.0);


        // UPCASTING
        Account01 acc1 = acc;
        BusinessAccount01 acc2 = new BusinessAccount01(1003, "Mia", 0.0, 500.0);
        Account01 acc3 = new BusinessAccount01(1004, "Bia", 0.0, 500.0);
        Account01 acc4 = new SavingsAccount(1005, "Carla", 0.0, 500.0);

        // DAWNCASTING

        BusinessAccount01 acc5 = (BusinessAccount01) acc3;
        BusinessAccount01 acc6 = acc2;
        acc5.loan(100.1);

        // BusinessAccount01 acc7 = (BusinessAccount01) acc4;
        if ( acc4 instanceof BusinessAccount01) {
            BusinessAccount01 acc7 = (BusinessAccount01) acc4;
            acc7.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc4 instanceof SavingsAccount){
            SavingsAccount acc7 = (SavingsAccount)acc4;
            acc7.updateBalance();
            System.out.println("Update!");
        }

        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        accX.withdraw(200.0);
        System.out.println(accX.getBalance());

        accY.withdraw(200.0);
        System.out.println(accY.getBalance());

    }
}
