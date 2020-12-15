import java.util.Scanner;

public class Soal02 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.printf(
            "Input terdiri atas X dan Y (X < Y)\nProgram akan mencetak secara horizontal sebanyak X, kemudian mencetak semua nilai dari 1 hingga Y secara vertikal.\n\n");
      short X, Y;

      System.out.print("X = ");
      X = userInput.nextShort();
      System.out.print("Y = ");
      Y = userInput.nextShort();
      System.out.println();

      for (short i = 1; i <= Y; i++) {
         if (i % X == 0)
            System.out.println(i + " ");
         else
            System.out.print(i + " ");
      }
      System.out.println();
   }
}