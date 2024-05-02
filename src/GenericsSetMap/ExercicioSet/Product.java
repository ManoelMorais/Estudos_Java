package GenericsSetMap.ExercicioSet;

import java.io.*;
import java.time.Instant;
import java.util.*;

public class Product  {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<Log> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new Log(username, moment));

                line = br.readLine();
            }
            System.out.println("Total logs: " + set.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}
