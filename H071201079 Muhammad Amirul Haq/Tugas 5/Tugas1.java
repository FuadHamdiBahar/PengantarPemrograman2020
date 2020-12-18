import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int fpb = cariFPB(x, y);

        System.out.println("FPB " + x + " dan " + y + " = " + fpb);
        scanner.close();
    }

    public static int cariFPB(int x, int y) {
        if (y == 0)
            return x;
        else
            return cariFPB(y, x % y);

    }
}