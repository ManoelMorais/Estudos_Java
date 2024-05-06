package ProFuncionalExpressoesLambidas.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Streamm {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5,10, 7);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        java.util.stream.Stream<Integer> st1 = list.stream().map(x -> x * n);
        System.out.println(Arrays.toString(st1.toArray()));

        java.util.stream.Stream<String> st2 = java.util.stream.Stream.of("Maria", "Alex", "Bobo");
        System.out.println(Arrays.toString(st2.toArray()));

        java.util.stream.Stream<Integer> st3 = java.util.stream.Stream.iterate(0, x -> x + n);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        java.util.stream.Stream<Long> st4 = java.util.stream.Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
