package Projetos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Exercicio01Work {
    private String name;
    private Exercicio01WorkLevel level;
    private Double baseSalary;

    private Exercicio01Departament departament;
    private List<Exercicio01HourContract> contracts = new ArrayList<>();

    public Exercicio01Work(){}

    public Exercicio01Work(String name, Exercicio01WorkLevel level, Double baseSalary, Exercicio01Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exercicio01WorkLevel getLevel() {
        return level;
    }

    public void setLevel(Exercicio01WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Exercicio01Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Exercicio01Departament departament) {
        this.departament = departament;
    }

    public List<Exercicio01HourContract> getContracts() {
        return contracts;
    }

    public void addContract(Exercicio01HourContract contract) {
        contracts.add(contract);
    }

    public void removedContract(Exercicio01HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (Exercicio01HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return  sum;
    }
}
