package HerancaPolimorfismo.Final;

public abstract class TextPayer {
    private String name;
    private Double anualincome;

    public TextPayer(){}

    public TextPayer(String name, Double anualincome) {
        this.name = name;
        this.anualincome = anualincome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualincome() {
        return anualincome;
    }

    public void setAnualincome(Double anualincome) {
        this.anualincome = anualincome;
    }

    public abstract double tax();
}
