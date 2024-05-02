package GenericsSetMap.Set.exemplos;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Set<ProgramEx> set = new TreeSet<>();
        set.add(new ProgramEx("TV", 900.0));
        set.add(new ProgramEx("Notebook", 1200.0));
        set.add(new ProgramEx("Tablet", 400.0));
        for (ProgramEx p : set) {
            System.out.println(p);
        }
    }
}
