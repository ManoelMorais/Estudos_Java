package GenericsSetMap.TiposCoringasGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coringas {

    //List<Object> não é o supertipo de qualquer tipo de lista:
    List<Object> myObjs = new ArrayList<Object>();
    List<Integer> myNumbers = new ArrayList<Integer>();
    // myObjs = myNumbers; // erro de compilação

    //O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
    List<?> myObject = new ArrayList<Object>();
    List<Integer> myNumber = new ArrayList<Integer>();
    // myObjs = myNumbers;

    // Com tipos curinga podemos fazer métodos
    // que recebem um genérico de "qualquer tipo":

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("a", "b", "c");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Porém não é possível adicionar dados a uma
    //coleção de tipo curinga

//    public static void naoRecebe(String[] args) {
//        List<?> list = new ArrayList<Integer>();
//        list.add(3); // erro de compilação
//    }
}
