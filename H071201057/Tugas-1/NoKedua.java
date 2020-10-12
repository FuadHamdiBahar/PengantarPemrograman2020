import java.util.Scanner;
public class NoKedua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tw = scan.nextInt(); //tw = total waktu

        int sisa = tw % 3600;
        int jam = tw / 3600;
        int menit = sisa / 60;
        int detik = tw - (jam * 3600) - (menit * 60);

        scan.close();
        
        System.out.print("Jam:Menit:Detik = ");
        System.out.println(jam + ":" + menit + ":" + detik);

    }
}
