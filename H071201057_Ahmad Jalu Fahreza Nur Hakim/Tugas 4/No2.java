import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        int[][] a = new int[i][j];
        int[][] b = new int[j][k];
        int[][] hasil = new int[i][k];

        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                a[l][m] = scan.nextInt();
            }
        }

        for (int l = 0; l < j; l++) {
            for (int m = 0; m < k; m++) {
                b[l][m] = scan.nextInt();
            }
        }

        for (int l = 0; l < i; l++) {
            for (int m = 0; m < k; m++) {
                hasil[l][m] = 0;
                for (int n = 0; n < j; n++) {   
                    hasil[l][m] = hasil[l][m] + (a[l][n] * b[n][m]);
                }
            }
        }

        for (int l = 0; l < i; l++) {
            for (int m = 0; m < k; m++) {
                System.out.print(hasil[l][m] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
