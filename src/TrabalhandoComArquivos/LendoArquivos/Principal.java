package TrabalhandoComArquivos.LendoArquivos;

import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        // MODO 01
        File file = new File("C:\\Users\\PC\\Documents\\Certificados\\StatusdeServidor.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }
        }


        // MODO 02
        String path = "C:\\Users\\PC\\Documents\\Certificados\\StatusdeServidor.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // MODO 03
        String arquivo = "C:\\Users\\PC\\Documents\\Certificados\\StatusdeServidor.txt";

        try (BufferedReader br2 = new BufferedReader(new FileReader(arquivo))){
            String pasta = br2.readLine();

            while (pasta != null){
                System.out.println(pasta);
                pasta = br2.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // MODO 04

        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
        String paths = "C:\\Users\\PC\\Documents\\JavaCurso\\PDF_curso_udemy_java\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(paths, true))){
            for (String documento : lines){
                bw.write(documento);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // MODO 05

        Scanner scc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String strPath = scc.nextLine();

        File filee = new File(strPath);
        File[] folders = filee.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = filee.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File filess : files){
            System.out.println(filess);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        scc.close();

        // MODO 06

        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPathh = scann.nextLine();

        File fileee = new File(strPathh);

        System.out.println("getName: " + fileee.getName());
        System.out.println("getParent: " + fileee.getParent());
        System.out.println("getPath: " + fileee.getPath());
    }
}
