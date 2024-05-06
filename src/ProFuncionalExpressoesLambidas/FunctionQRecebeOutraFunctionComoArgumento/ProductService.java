package ProFuncionalExpressoesLambidas.FunctionQRecebeOutraFunctionComoArgumento;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filterSum(List<Product> list, Predicate<Product> predicate) {
        double sum = 0.0;

        for (Product product : list) {
            if (predicate.test(product)){
                sum += product.getPrice();
            }
        }

        return sum;
    }
}
