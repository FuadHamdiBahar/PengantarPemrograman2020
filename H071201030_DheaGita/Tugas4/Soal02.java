import java.util.Scanner;

public class Soal02 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      // i, j, k = variabel dari soal
      int i = obj.nextInt();
      int j = obj.nextInt();
      int k = obj.nextInt();

      int[][] matriksA = new int[i][j];
      int[][] matriksB = new int[j][k];
      int[][] hasil = new int[i][k];

      System.out.println("Input Matriks A");
      for (int a = 0; a < i; a++) {
         for (int b = 0; b < j; b++) {
            matriksA[a][b] = obj.nextInt();
         }
      }
      System.out.println("Input Matriks B");
      for (int a = 0; a < j; a++) {
         for (int b = 0; b < k; b++) {
            matriksB[a][b] = obj.nextInt();
         }
      }
      System.out.println("Hasil Perkalian Matriks A dengan Matriks B");
      for (int a = 0; a < i; a++) {
         for (int b = 0; b < k; b++) {
            for (int c = 0; c < j; c++) {
               hasil[a][b] += matriksA[a][c] * matriksB[c][b];
            }
            System.out.print(hasil[a][b] + " ");
         }
         System.out.println();
      }
   }
}
