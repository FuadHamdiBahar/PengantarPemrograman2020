import java.io.*;
import java.util.Scanner;

public class Soal01 {
   public static void main(String[] args) {
      // Deklarasi file dengan null agar tidak terjadi IOException
      FileInputStream fileInput = null;
      FileOutputStream fileOutput = null;
      File isChecked = null;
      // User Input
      Scanner obj = new Scanner(System.in);
      String input1 = obj.nextLine();
      String input2 = obj.nextLine();
      obj.close();
      try {
         // Membuka file
         fileInput = new FileInputStream(input1 + ".txt");
         fileOutput = new FileOutputStream(String.format("%s.txt", input2));
         isChecked = new File(input1 + ".txt");
         // Membaca file
         int data = fileInput.read();
         while (data != -1) {
            fileOutput.write(data);
            data = fileInput.read();
         }
         if (isChecked.exists()) {
            System.out.println("Berhasil");
         }
      } catch (IOException ioe) {
         System.out.println("Gagal");
      } finally {
         try {
            if (fileInput != null) {
               fileInput.close();
            }
            if (fileOutput != null) {
               fileOutput.close();
            }
         } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
         }
      }
   }
}