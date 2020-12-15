import java.util.Scanner;

public class Soal05 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(
            "Inputan terdiri atas 1 bilangan float M (0 <= M <= 360) yang menunjukkan posisi matahari atau bulan. Inputan akan berhenti dengan end of file (EOF)");

      while (input.hasNext()) {
         float M = input.nextFloat();
         if (M >= 0 && M < 360) {
            int detik = (int) (M * 86400) / 360;
            int jj = (detik / 3600) + 6;
            int mm = (detik % 3600) / 60;
            int dd = (detik % 3600) % 60;

            if (M >= 0 && M < 90) { // 06.00-11.59
               System.out.println("Selamat Pagi!");
            } else if (M >= 90 && M < 150) {// 12.00-15.59
               System.out.println("Selamat Siang!");
            } else if (M >= 150 && M < 195) {// 16.00-18.59
               System.out.println("Selamat Sore!");
            } else if (M >= 195 && M < 270) {// 19.00-23.59
               System.out.println("Selamat Malam!");
            } else if (M >= 270 && M < 360) {// 00.00-05.59
               System.out.println("Dini Hari!");
            }
            if (jj >= 24) {
               int jam = jj - 24;
               System.out.printf("%02d:%02d:%02d \n", jam, mm, dd);
            } else {
               System.out.printf("%02d:%02d:%02d \n", jj, mm, dd);
            }
         } else {
            System.out.println("Input tidak valid! Silakan input sesuai angka dalam derajat (0 - 360)");
         }
      }
      input.close();
   }
}