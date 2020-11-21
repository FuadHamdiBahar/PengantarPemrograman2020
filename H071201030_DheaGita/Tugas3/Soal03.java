import java.util.Scanner;

public class Soal03 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Input sebuah nilai n tipe integer yang menyatakan elemen ke-n dalam himpunan A!");
      long n, a, b, COUNT, NEXT;
      a = 0;
      b = 1;
      COUNT = 2;

      System.out.print("n = ");
      n = userInput.nextLong();

      System.out.printf("\nCetak elemen pertama hingga n elemen dalam A!\n");
      System.out.print(a + " ");
      System.out.print(b + " ");

      for (int i = 0; COUNT < n; i++) {
         // NEXT : Rumus mencari nilai selanjutnya
         NEXT = a + b;
         System.out.print(NEXT + " ");
         // awalnya kan a = 0, b = 1. Jadi nilai a adalah b dan b adalah nilai
         // selanjutnya
         a = b;
         b = NEXT;
         // COUNT : Perhitungan banyaknya himpunan A yang keluar
         COUNT++;
      }
   }
}
