import java.util.Scanner;

public class Soal03 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      int jHari = obj.nextInt();
      int tahun = myYear(jHari);
      int bulan = myMonth(jHari);
      int hari = myDay(jHari);
      int sisa;
      System.out.printf("%s tahun\n%s bulan\n%s hari\n", tahun, bulan, hari);
   }

   public static int myYear(int jHari) {
      int tahun = jHari / 365;
      return tahun;
   }

   public static int myMonth(int jHari) {
      int bulan = (jHari % 365) / 30;
      return bulan;
   }

   public static int myDay(int jHari) {
      int hari = (jHari % 365) % 30;
      return hari;
   }
}
