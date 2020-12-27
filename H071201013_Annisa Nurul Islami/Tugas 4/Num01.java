import java.util.Scanner;

public class Num01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt;
        int[] element = new int[n];

        for (int i = 0; i < element.length; i++) {
            element[i] = scan.nextInt();
        }
        for (i = 0; i < n;  i++) {
            for (j = i+1; j < n; j++) {
                if (element[i] % element[j] == 0 || element[j] % element[i] == 0) {
                    continue;
                }
                else {
                    System.out.println(element[i] + " ");
                    System.out.println(element[j]);
                }
            }
        }
    }
}
