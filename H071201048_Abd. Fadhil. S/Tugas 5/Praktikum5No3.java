import java.util.Scanner;
public class Praktikum5No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Inputan Anda");
        int a = input.nextInt();
        myDay(a);
        
    }
    static void myDay(int a) {
        int tahun = 0;
        tahun = a / 360;
        int bulan = 0;
        bulan = (a % 360) / 30;
        int hari = 0;
        hari = (a % 360) % 30;
        System.out.println(tahun + " tahun");
        System.out.println(bulan + " bulan");
        System.out.println(hari + " hari");
    }
    
}
