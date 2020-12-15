import java.util.Scanner;

public class Soal01 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      // n = panjang array
      int n = obj.nextInt();
      // Deklarasi array elemen
      int[] elemen = new int[n];

      // i = elemen-elemen
      for (int i = 0; i < n; i++) {
         elemen[i] = obj.nextInt();
      }
      for (int i = 0; i < n; i++) {
         for (int j = i + 1; j < n; j++) {
            // Math.min = mencari nilai terkecil
            int a = Math.min(elemen[i], elemen[j]);
            boolean prima = true;
            for (int k = a; k > 1; k--) {
               if ((elemen[i] % k == 0 && (elemen[j] % k == 0))) {
                  prima = false;
                  break;
               }
            }
            if (prima) {
               System.out.println(elemen[i] + " " + elemen[j]);
            }
         }
      }
   }
}
