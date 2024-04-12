package Projetos.Three;

public class fixacao01OrderItem {

    private Integer quantity;
    private Double price;
    private fixacao01Product product;

    public fixacao01OrderItem(){}

    public fixacao01OrderItem(Integer quantity, Double price, fixacao01Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public fixacao01Product getProduct() {
        return product;
    }

    public void setProduct(fixacao01Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return product.getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
