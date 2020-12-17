import java.util.Scanner;
public class Praktikum3No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Harga Barang dan Nilai Uang Yang Dibayarkan");
        int Harga = input.nextInt();
        int Uang = input.nextInt();
        int seratus = 0;
        int limapuluh = 0;
        int duapuluh = 0;
        int sepuluh = 0;
        int limaribu = 0;
        int duaribu = 0;
        int seribu = 0;
        if(Harga <= Uang) {
                   int kembalian = Uang - Harga;

        while(kembalian > 0) {
            if(kembalian - 100000 >= 0) {
                kembalian -= 100000;
                seratus++;
            }else if (kembalian - 50000 >= 0) {
                kembalian -= 50000;
                limapuluh++;
            }else if (kembalian - 20000 >= 0) {
                kembalian -= 20000;
                duapuluh++;
            }else if (kembalian - 10000 >= 0) {
                kembalian -= 10000;
                sepuluh++;
            }else if (kembalian - 5000 >= 0) {
                kembalian -= 5000;
                limaribu++;
            }else if (kembalian - 2000 >= 0) {
                kembalian -= 2000;
                duaribu++;
            }else if (kembalian - 1000 == 0) {
                kembalian -= 1000;
                seribu++;
            }
            }
            System.out.println(seratus + " uang Rp.100.000");
            System.out.println(limapuluh + " uang Rp.50.000");
            System.out.println(duapuluh + " uang Rp20.000");
            System.out.println(sepuluh + " uang Rp.10.000");
            System.out.println(limaribu + " uang Rp.5.000");
            System.out.println(duaribu + " uang Rp.2.000");
            System.out.println(seribu + " uang Rp.1000");
        }else {
            System.out.println("Maaf Uang Anda Tidak Cukup");
        }
        }
 



        
    }

