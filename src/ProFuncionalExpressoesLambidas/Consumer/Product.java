package ProFuncionalExpressoesLambidas.Consumer;

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

    public static void staticPriceUpdate(Product product ){
        product.setPrice(product.getPrice() * 1.1);
    }

    public void NoStaticPriceUpdate() {
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", price = " + price ;
    }
}
