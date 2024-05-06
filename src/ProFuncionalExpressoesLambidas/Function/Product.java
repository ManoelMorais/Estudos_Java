package ProFuncionalExpressoesLambidas.Function;

public class Product {
    private String name;
    private  Double price;

    public Product() {
    }

    public Product(String name, Double price) {
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

    public static String staticUpperCase(Product product){
        return product.getName().toUpperCase();
    }

    public String NoStaticUpperCase() {
       return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Name = " + name + ", price = " + price ;
    }
}
