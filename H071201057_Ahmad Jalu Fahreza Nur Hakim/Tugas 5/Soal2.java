import java.util.Scanner;
import java.util.Random;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
        scan.close();
    }

    public static String generateSerial (int n, int m){
        Random angkaRandom = new Random();
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                str += angkaRandom.nextInt(10);
            }
            if (i < (n-1) ) {
                str += "-";
            }
        }
        return str;
    }
}
