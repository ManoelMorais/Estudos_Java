package ProgramacaoOrientadaAObjeto.DesafioPoo.ExercicioM;

public class Entitie {
    public String name;
    public double salary;
    public double tax;

    public double NetSalary() {
        return salary - tax;
    }

    public void IncreaseSalary(double percentege) {
        double increaseAmount = salary * (percentege / 100.0);
        salary += increaseAmount;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", NetSalary());
    }
}
