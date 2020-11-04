// Input 1 = 9 0 18 -2 97

// Output 1 = 
// 3 angka Genap
// 2 angka Ganjil
// 3 angka Positif
// 1 angka Negatif

// input 2 = F 2 3 0 -8

// Output 2 = Inputan Tidak Valid
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal01 {
   public static void main(String[] args) {
      try {
         Scanner userInput = new Scanner(System.in);

         int a, b, c, d, e;

         int even = 0;
         int odd = 0;
         int positive = 0;
         int negative = 0;

         System.out.println("Input 5 bilangan bulat yang dipisah oleh spasi!");
         System.out.print("Input : ");

         a = userInput.nextInt();
         b = userInput.nextInt();
         c = userInput.nextInt();
         d = userInput.nextInt();
         e = userInput.nextInt();

         if (a % 2 == 0)
            even++;
         else
            odd++;

         if (a > 0)
            positive++;
         if (a < 0)
            negative++;

         if (b % 2 == 0)
            even++;
         else
            odd++;

         if (b > 0)
            positive++;
         if (b < 0)
            negative++;

         if (c % 2 == 0)
            even++;
         else
            odd++;

         if (c > 0)
            positive++;
         if (c < 0)
            negative++;

         if (d % 2 == 0)
            even++;
         else
            odd++;

         if (d > 0)
            positive++;
         if (d < 0)
            negative++;

         if (e % 2 == 0)
            even++;
         else
            odd++;

         if (e > 0)
            positive++;
         if (e < 0)
            negative++;

         System.out.println("Output : ");
         System.out.println(even + " angka Genap");
         System.out.println(odd + " angka Ganjil");
         System.out.println(positive + " angka Positif");
         System.out.println(negative + " angka Negatif");

      } catch (InputMismatchException ime) {
         System.out.println("Inputan Tidak Valid");
         System.out.println(ime);
      }
   }
}