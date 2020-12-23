import java.io.*;
import java.util.*;

public class Soal02 {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner obj = new Scanner(System.in);
      // Deklarasi file dengan null agar tidak terjadi IOException
      FileReader fileReader = null;
      BufferedReader buffReader = null;
      FileWriter fileWriter = null;
      PrintWriter printWriter = null;
      try {
         // User Input
         String input1 = obj.nextLine();
         String input2 = obj.nextLine();
         obj.close();
         // Membuka file
         fileReader = new FileReader(String.format("%s.txt", input1));
         buffReader = new BufferedReader(fileReader);
         fileWriter = new FileWriter(String.format("%s.txt", input2));
         printWriter = new PrintWriter(fileWriter);
         // Membaca file
         String data = buffReader.readLine();
         int max = 0;
         while (data != null) {
            max = data.length() > max ? data.length() : max;
         }
         fileReader = new FileReader(String.format("%s.txt", input1));
         buffReader = new BufferedReader(fileReader);
         // Menulis file
         String data2 = buffReader.readLine();
         while (data2 != null) {
            printWriter.write(String.format("%" + max + "s\n", data2));
         }
      } catch (IOException ioe) {
         System.out.println("Gagal");
      } finally {
         try {
            if (fileWriter != null) {
               System.out.println("Berhasil");
               fileWriter.close();
            }
            if (fileReader != null) {
               fileReader.close();
            }
         } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
         }
      }
   }
}