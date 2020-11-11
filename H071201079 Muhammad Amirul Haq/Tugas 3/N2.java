import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int x = user.nextInt();
        int y = user.nextInt();

        int i = 0;
        int j = 1;

        System.out.print(j + " ");

        while(j < y) {
            i = 0;
            while(i < x - 1 && j < y) {
                j++;
                System.out.print(j + " ");
                i++;
            }
            if(j < y) {
                j++;
                System.out.print("\n" + j + " ");
            }
        }

        user.close();
    }
}
