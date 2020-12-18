import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i, j, k;

        i = scanner.nextInt();
        j = scanner.nextInt();
        k = scanner.nextInt();

        System.out.println();

        int matrix[][] = new int[i][j];
        System.out.println("ordo matrices 3x2");
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                matrix[l][m] = scanner.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("perkalian matrices, ordo 2x3");
        int matrix2[][] = new int[j][k];
        for (int l = 0; l < j; l++) {
            for (int m = 0; m < k; m++) {
                matrix2[l][m] = scanner.nextInt();

            }
        }

        System.out.println("\n");
        System.out.println("hasil perkalian matrices");

        for (int l = 0; l < i; l++) {
            for (int m = 0; m < k; m++) {

                int perkalian = 0;
                
                for (int n = 0; n < j; n++) {
                    perkalian += matrix[l][n] * matrix2[n][m];
                }

                System.out.print(perkalian + "  ");
            }
            System.out.println();
        }

        scanner.close();
    }
}