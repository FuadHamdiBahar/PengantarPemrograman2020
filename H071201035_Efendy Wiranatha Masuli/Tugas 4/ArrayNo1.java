import java.util.Scanner;
public class ArrayNo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] nilai = new int [n];

        for(int i = 0; i < nilai.length; i++) {
           nilai [i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++ ) {
                if(nilai [i] % nilai [j] != 0 && nilai [j] % nilai [i] != 0)
                System.out.println(nilai [i] + " " + nilai [j]);
            }
        }
    }
}