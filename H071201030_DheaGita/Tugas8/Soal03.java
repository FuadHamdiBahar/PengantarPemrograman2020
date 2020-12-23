import java.io.*;
import java.util.Scanner;

class Soal03 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      FileReader fileReader = null;
      BufferedReader bufferedReader = null;
      FileWriter fileWriter = null;
      PrintWriter printWriter = null;

      try {
         String file = obj.nextLine();
         int data = obj.nextInt();
         obj.nextLine();
         String[] nama = new String[data];
         String[] nim = new String[data];
         String[] angkatan = new String[data];
         for (int i = 0; i < data; i++) {
            nama[i] = obj.nextLine();
            nim[i] = obj.nextLine();
            angkatan[i] = obj.nextLine();
         }
         obj.close();
         fileWriter = new FileWriter(file + ".txt");
         printWriter = new PrintWriter(fileWriter);

         printWriter.println("+--------------------+-----------+---------+");
         printWriter.println("|Nama                |NIM        |Angkatan |");
         printWriter.println("+--------------------+-----------+---------+");
         for (int i = 0; i < data; i++) {
            printWriter.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
         }
         printWriter.println("+--------------------+-----------+---------+");
         System.out.println("Berhasil");

      } catch (IOException ioe) {
         System.out.println("Gagal");
      } finally {
         try {
            if (bufferedReader != null) {
               bufferedReader.close();
            }
            if (fileReader != null) {
               fileReader.close();
            }
            if (printWriter != null) {
               printWriter.close();
            }
         } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
         }
      }
   }
}