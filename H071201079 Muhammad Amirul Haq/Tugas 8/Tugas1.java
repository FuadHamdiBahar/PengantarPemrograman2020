import java.io.*;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream(scanner.next()+".txt");
            output = new FileOutputStream(scanner.next()+".txt");
            int file;

            while ((file = input.read()) != -1) {
                output.write(file);
            }

        } catch (IOException ioe) {
            System.out.println("GAGAL");
        } finally {

            try {
                
                if (input != null) {
                    System.out.println("BERHASIL");
                    input.close();
                }

                if (output != null) {
                    output.close();
                }

            } catch (IOException ioe) {
                System.out.println("GAGAL");
            }
        }

        scanner.close();
    }
} 