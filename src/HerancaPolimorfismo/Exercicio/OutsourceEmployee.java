package HerancaPolimorfismo.Exercicio;

public class OutsourceEmployee extends Employee {
    private Double additional;

    public OutsourceEmployee(){
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additional) {
        super(name, hours, valuePerHour);
        this.additional = additional;
    }

    public Double getAdditional() {
        return additional;
    }

    public void setAdditional(Double additional) {
        this.additional = additional;
    }


    @Override
    public Double payment(){
        return super.payment() + additional * 1.1;
    }
}
