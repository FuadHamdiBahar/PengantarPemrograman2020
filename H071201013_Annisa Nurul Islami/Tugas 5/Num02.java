import java.util.Scanner;
import java.util.Random;

public class Num02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    
    public static String generateSerial (int n, int m) {
        Random r = new Random();
        String str = "";

        for (int p = 1;  p <= n; p++) {
            for (int q = 1; q <= m; q++) {
               str += r.nextInt(10);
            }                                                                                                                                                       
            if (p < n) {
                str += "-";
            }
        } 
        return str;         
    }
}
