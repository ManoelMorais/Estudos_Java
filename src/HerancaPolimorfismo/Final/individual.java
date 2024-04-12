package HerancaPolimorfismo.Final;

public class individual extends TextPayer{
    private Double healthexpenditures;

    public individual(String name, Double anualincome, Double healthexpenditures) {
        super(name, anualincome);
        this.healthexpenditures = healthexpenditures;
    }

    public Double getHealthexpenditures() {
        return healthexpenditures;
    }

    public void setHealthexpenditures(Double healthexpenditures) {
        this.healthexpenditures = healthexpenditures;
    }

    @Override
    public double tax() {
        if (getAnualincome() < 20000.0) {
            return getAnualincome() * 0.15 - healthexpenditures * 0.5;
        }
        else {
            return getAnualincome() * 0.25 - healthexpenditures * 0.5;
        }
    }
}
