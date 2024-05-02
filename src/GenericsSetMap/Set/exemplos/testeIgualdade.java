package GenericsSetMap.Set.exemplos;

import java.util.*;

public class testeIgualdade {
    public static void main(String[] args) {

        Set<ProdutoTesteIgualdade> set = new HashSet<>();

        set.add(new ProdutoTesteIgualdade("TV", 900.0));
        set.add(new ProdutoTesteIgualdade("Notebook", 1200.0));
        set.add(new ProdutoTesteIgualdade("Tablet", 400.0));

        ProdutoTesteIgualdade prod = new ProdutoTesteIgualdade("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }
}
