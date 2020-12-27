import java.util.Scanner;

public class Num01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.printf("FPB dari %d dan %d = %d", x, y, findGCD(x, y));
    }
    public static int findGCD (int a, int b) {
        int c = 0;
        for (int d = 1; d <= (a < b ? b : a); d++) {
            if (a % d == 0 && b % d == 0) {
                c = d;
            }
        }
        return c;
    }
}
