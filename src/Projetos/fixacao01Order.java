package Projetos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class fixacao01Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private fixacao01OrderStatus status;

    private fixacao01Client client;
    private final List<fixacao01OrderItem> items = new ArrayList<>();

    public fixacao01Order(Date moment, fixacao01OrderStatus status, fixacao01Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public fixacao01OrderStatus getStatus() {
        return status;
    }

    public void setStatus(fixacao01OrderStatus status) {
        this.status = status;
    }

    public fixacao01Client getClient() {
        return client;
    }

    public void setClient(fixacao01Client client) {
        this.client = client;
    }

    public List<fixacao01OrderItem> getItems() {
        return items;
    }

    public void addItem(fixacao01OrderItem item) {
        items.add(item);
    }

    public void removeItem(fixacao01OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (fixacao01OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (fixacao01OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
