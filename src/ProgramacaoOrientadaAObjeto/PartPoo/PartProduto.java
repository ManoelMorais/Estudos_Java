package ProgramacaoOrientadaAObjeto.PartPoo;

public class PartProduto {

    public String name;
    public double price;
    public int quantity;

    public PartProduto(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProdutc(int quantity) {
        this.quantity += quantity;
        // esse eo public / esse eo parametro
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
