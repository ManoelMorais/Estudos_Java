package Projetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exercicio02 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Exercicio02Commnet c1 = new Exercicio02Commnet("Have a nice trip!");
        Exercicio02Commnet c2 = new Exercicio02Commnet("Wow that's awesome");

        Exercicio02Post p1 = new Exercicio02Post(
                sdf.parse("22/02/2022 12:22:22"),
                        "Bangladesh",
                     "Visited this country",
                        12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
