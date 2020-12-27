import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int fpb = cariFPB(n,m);
        System.out.printf("FPB dari %d dan %d = %d", n, m, fpb);
        scan.close();
    }

    public static int cariFPB(int n, int m) {
        int besar = n;
        int kecil = m;
        int fpb = 0;

        if (n > m){
            besar = n;
            kecil = m;
        }
        
        for (int i = kecil ; i > 0 ; i--) {
            if (kecil % i == 0 && besar % i == 0) {
                fpb = i;
                System.out.println(fpb);
            }
        }
        return fpb;
    }
}
