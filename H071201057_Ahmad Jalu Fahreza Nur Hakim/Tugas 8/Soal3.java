import java.io.*;
import java.util.Scanner;
class Soal3 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner (System.in);

        BufferedReader buffer = null;
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try { 
            String namaFile = scan.nextLine();
            int n = scan.nextInt();
            scan.nextLine();
            String[] nama = new String [n];
            String[] nim = new String [n];
            String[] angkatan = new String [n];
            for (int i = 0; i < n; i++) {
                nama[i] = scan.nextLine();
                nim[i] = scan.nextLine();
                angkatan[i] = scan.nextLine();
            }
            scan.close();
            fileWriter = new FileWriter(namaFile + ".txt");
            printWriter = new PrintWriter(fileWriter);

            printWriter.println("+--------------------+-----------+---------+");
            printWriter.println("|Nama                |NIM        |Angkatan |");
            printWriter.println("+--------------------+-----------+---------+");
            for (int i = 0; i < n; i++) {
                printWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
            }
            printWriter.println("+--------------------+-----------+---------+");
            System.out.println("Berhasil");

        } catch (IOException ioe) {
            System.out.println("Gagal");
        } finally {
            try {
                if (buffer !=  null) {
                    buffer.close();      
                }
                if (fileReader !=  null) {
                    fileReader.close();
                }
                if ( printWriter != null) {
                    printWriter.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}