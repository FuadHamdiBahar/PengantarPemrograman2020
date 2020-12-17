import java.util.Scanner;
public class Praktikum4No2 {
    public static void main(String[] args) {
        System.out.println("Masukkan Inputan Anda");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];
        int[][] matriksC = new int[i][k];
        int jumlah = 0;

        System.out.println("Input Matriks A");
        for(int a = 0; a < matriksA.length; a++) {
            for (int b = 0; b < matriksA[a].length; b++) {
                matriksA[a][b] = input.nextInt();
            }
        }
        System.out.println("Input Matriks B");
        for(int a = 0; a < matriksB.length; a++) {
            for (int b = 0; b < matriksB[a].length; b++) {
                matriksB[a][b] = input.nextInt();
            }
        }
        for(int a = 0; a < i; a++) {
            for(int b = 0; b < k; b++) {
                for(int c = 0; c < j;  c++) {
                    jumlah = jumlah + matriksA[a][c] * matriksB[c][b];
                }
                matriksC[a][b]= jumlah;
                jumlah = 0;
            }
        }
        System.out.println("Perkalian Matriks");
        for(int a = 0; a < i; a++) {
            for (int b = 0; b < k; b++) {
                System.out.print(matriksC[a][b] + " ");
            }
            System.out.println();
        }
    }   
}
