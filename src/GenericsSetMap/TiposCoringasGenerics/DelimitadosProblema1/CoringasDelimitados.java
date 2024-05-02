package GenericsSetMap.TiposCoringasGenerics.DelimitadosProblema1;

import java.util.ArrayList;
import java.util.List;

public class CoringasDelimitados {
    public static void main(String[] args) {

        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Retangle(3.0, 2.0));
        myShape.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircle));
    }

    public static double totalArea(List<? extends Shape> myShape) {
        double sum = 0.0;
        for (Shape shape : myShape) {
            sum += shape.area();
        }
        return sum;
    }
}
