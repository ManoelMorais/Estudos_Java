package GenericsSetMap.Map;

import java.util.Objects;

public class Demo2 {

    private String name;
    private Double price;

    public Demo2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo2 demo2 = (Demo2) o;
        return Objects.equals(name, demo2.name) && Objects.equals(price, demo2.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // getters, setters, equals, hashCode

}
