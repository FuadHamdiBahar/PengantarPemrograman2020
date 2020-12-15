import java.util.Random;
import java.util.Scanner;

public class Soal02 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int m = obj.nextInt();
      String serialNumber = generateSerial(n, m);
      System.out.println(serialNumber);
   }

   public static String generateSerial(int n, int m) {
      Random acak = new Random();
      for (int i = 0; i < n; i++) {
         for (int j = 1; j <= m; j++) {
            int nilai = acak.nextInt(9);
            System.out.printf("%d", nilai);
            if (j % m == 0 && i < n - 1) {
               System.out.print("-");
            }
         }
      }
      String str = "";
      return str;
   }
}
