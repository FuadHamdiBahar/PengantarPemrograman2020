import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int hargaBarang = user.nextInt();
        int uangDibayar = user.nextInt();

        int kembalian = uangDibayar - hargaBarang;

        int[] Uang = {100000, 50000, 20000, 10000, 5000, 2000, 1000};

        for(int i = 0; i < Uang.length; i++) {
            int jumlahUang = kembalian / Uang[i];
            kembalian -= (Uang[i] * jumlahUang);
            System.out.println(jumlahUang + " uang Rp. " + Uang[i]);
        }

        user.close();
    }
}
