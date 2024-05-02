package GenericsSetMap.TiposCoringasGenerics.DelimitadosProblema2;

import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // Princípio get/put - covariância
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);
        //list.add(20); // erro de compilacao
        // get - OK
        // put - ERROR

        // Princípio get/put - contravariância
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);
        // Number x = myNums.get(0); // erro de compilacao
        // get - ERROR
        // put - OK


        //Princípio get/put - contravariância
        List<Object> myObject = new ArrayList<Object>();
        myObject.add("Maria");
        myObject.add("Alex");

        List<? super Number> myNum = myObject;

        myNum.add(10);
        myNum.add(3.14);
        // Number x = myNums.get(0); // erro de compilacao
        // get - ERROR
        // put - OK

    }
}
