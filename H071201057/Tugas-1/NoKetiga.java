import java.util.Scanner;
public class NoKetiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double tan_a, tan_b;
        double x, y, p;

        System.out.println("Input h");
        int h = scan.nextInt();

        System.out.println("Input a");
        int a = scan.nextInt();

        System.out.println("Input b");
        int b = scan.nextInt();

        scan.close();

        tan_a = Math.tan(Math.toRadians(a));
        tan_b = Math.tan(Math.toRadians(b));

        y = tan_a * h;
        x = tan_b * h;

        p = y - x; 
        
        System.out.printf("%.1f",p);
        System.out.print(" m ");
    

        

    }
}
