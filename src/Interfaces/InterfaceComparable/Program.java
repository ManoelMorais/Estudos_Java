package Interfaces.InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\Users\\PC\\Documents\\JavaCurso\\aaa\\int.txt.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCSV = br.readLine();

            while (funcionarioCSV != null) {
                String[] fields = funcionarioCSV.split(",");
                list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
                funcionarioCSV = br.readLine();
            }

            Collections.sort(list);
            for (Funcionario emp : list){
                System.out.println(emp.getNome() + ", " + emp.getSalario());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
