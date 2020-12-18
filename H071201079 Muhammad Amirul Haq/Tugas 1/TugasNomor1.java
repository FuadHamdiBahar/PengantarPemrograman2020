import java.util.Scanner;

public class TugasNomor1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        float waktu, kecepatan, jumlahBensin;
        waktu = user.nextFloat();
        kecepatan = user.nextFloat();

        jumlahBensin = (waktu * kecepatan) / 14;

        System.out.printf("BENSIN YANG DIGUNAKAN : %.3f L" , jumlahBensin);
        user.close();
    }
}