import java.util.Scanner;

public class Soal01 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.println("Input dua bilangan bulat");
      int intOne = obj.nextInt();
      int intTwo = obj.nextInt();
      int fpb = cariFPB(intOne, intTwo);
      System.out.printf("FPB dari %s dan %s = %s", intOne, intTwo, fpb);
   }

   public static int cariFPB(int intOne, int intTwo) {
      int high = intOne;
      int low = intTwo;
      int fpb = 0;
      if (intOne > intTwo) {
         high = intOne;
         low = intTwo;
      }
      for (int i = low; i > 0; i--) {
         if (high % i == 0 && low % i == 0) {
            fpb = i;
         }
      }
      return fpb;
   }
}
