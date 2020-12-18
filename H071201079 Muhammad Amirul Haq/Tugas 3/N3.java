import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        long n = user.nextInt();

        long a = 0;
        long b = 1;

        long i = 2;
    
        System.out.printf(a + " " + b + " ");

        while(i < n) {
        long c = a + b;
            if(c < 0) {
                break;
            } else {
               
               System.out.print(c + " ");
               a = b;
               b = c;
               i++;
            }
        }

        user.close();
    }
}