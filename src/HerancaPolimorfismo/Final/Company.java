package HerancaPolimorfismo.Final;

public class Company extends TextPayer{
    private int numberofemployees;

    public Company(String name, Double anualincome, int numberofemployees) {
        super(name, anualincome);
        this.numberofemployees = numberofemployees;
    }

    public int getNumberofemployees() {
        return numberofemployees;
    }

    public void setNumberofemployees(int numberofemployees) {
        this.numberofemployees = numberofemployees;
    }

    @Override
    public double tax() {
        if (numberofemployees > 10) {
            return getAnualincome() * 0.14;
        }
        else {
            return getAnualincome() * 0.16;
        }
    }
}
