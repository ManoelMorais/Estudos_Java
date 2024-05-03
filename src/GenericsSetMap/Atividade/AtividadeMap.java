package GenericsSetMap.Atividade;

import GenericsSetMap.GenericsDelimited.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AtividadeMap {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.println("Enter file full path:");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] split = line.split(",");
                String name = split[0];
                int count = Integer.parseInt(split[1]);

                if (votes.containsKey(name)) {
                    int votesSoFar = votes.get(name);
                    votes.put(name, votesSoFar + count);
                } else {
                    votes.put(name, count);
                }
                line = br.readLine();
            }
            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
