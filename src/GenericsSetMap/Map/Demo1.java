package GenericsSetMap.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {

        Map<Demo2, Double> stock = new HashMap<>();

        Demo2 p1 = new Demo2("Tv", 900.0);
        Demo2 p2 = new Demo2("Notebook", 1200.0);
        Demo2 p3 = new Demo2("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Demo2 ps = new Demo2("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
