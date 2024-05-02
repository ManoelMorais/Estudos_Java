package GenericsSetMap.Set.exemplos;

import java.util.Objects;

public class ProgramEx implements Comparable<ProgramEx> {
    private String name;
    private Double price;

    public ProgramEx(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // (... get / set / hashCode / equals)
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public int compareTo(ProgramEx other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramEx programEx = (ProgramEx) o;
        return Objects.equals(name, programEx.name) && Objects.equals(price, programEx.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
