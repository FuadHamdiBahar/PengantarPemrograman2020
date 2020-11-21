import java.util.Scanner;

public class Soal04 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.printf("Inputan dua bilangan integer yaitu harga barang dan nilai uang yang dibayarkan!\n\n");

      int harga, uang, sisa, u100K, u50K, u20K, u10K, u5K, u2K, u1K;

      u100K = 0;
      u50K = 0;
      u20K = 0;
      u10K = 0;
      u5K = 0;
      u2K = 0;
      u1K = 0;

      System.out.print("Harga barang = ");
      harga = userInput.nextInt();
      System.out.print("Uang yang dibayarkan = ");
      uang = userInput.nextInt();

      if (harga < uang) {
         sisa = uang - harga;
         while (sisa > 0) {
            if (sisa - 100000 >= 0) {
               sisa -= 100000;
               u100K++;
            } else if (sisa - 50000 >= 0) {
               sisa -= 50000;
               u50K++;
            } else if (sisa - 20000 >= 0) {
               sisa -= 20000;
               u20K++;
            } else if (sisa - 10000 >= 0) {
               sisa -= 10000;
               u10K++;
            } else if (sisa - 5000 >= 0) {
               sisa -= 5000;
               u5K++;
            } else if (sisa - 2000 >= 0) {
               sisa -= 2000;
               u2K++;
            } else {
               sisa -= 1000;
               u1K++;
            }
         }
         System.out.println(u100K + " uang Rp 100.000");
         System.out.println(u50K + " uang Rp 50.000");
         System.out.println(u20K + " uang Rp 20.000");
         System.out.println(u10K + " uang Rp 10.000");
         System.out.println(u5K + " uang Rp 5000");
         System.out.println(u2K + " uang Rp 2.000");
         System.out.println(u1K + " uang Rp 1.000");

      } else if (harga == uang) {
         System.out.println("Uang pas, tidak ada kembalian");

      } else
         System.out.println("Uang tidak cukup");
   }
}