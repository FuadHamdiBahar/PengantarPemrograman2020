import java.util.Scanner;

public class Soal01 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.printf(
            "Program akan menentukan ganjil, genap, positif, dan negatif suatu inputan. Input nilai X dan Y, dimana X adalah nilai awal dan Y adalah nilai akhir!\n");

      short X, Y;
      System.out.print("X = ");
      X = userInput.nextShort();
      System.out.print("Y = ");
      Y = userInput.nextShort();
      System.out.println();

      for (short i = X; i <= Y; i++) {
         if (i > 0) {
            if (i % 2 == 0)
               System.out.printf("%d genap positif\n", i);
            else
               System.out.printf("%d ganjil positif\n", i);
         } else if (i < 0) {
            if (i % 2 == 0)
               System.out.printf("%d genap negatif\n", i);
            else
               System.out.printf("%d ganjil negatif\n", i);
         } else
            System.out.printf("%d nol\n", i);
      }
      for (short i = X; i >= Y; i--) {
         if (i > 0) {
            if (i % 2 == 0)
               System.out.printf("%d genap positif\n", i);
            else
               System.out.printf("%d ganjil positif\n", i);
         } else if (i < 0) {
            if (i % 2 == 0)
               System.out.printf("%d genap negatif\n", i);
            else
               System.out.printf("%d ganjil negatif\n", i);
         } else
            System.out.printf("%d nol\n", i);
      }
      System.out.println();
   }
}