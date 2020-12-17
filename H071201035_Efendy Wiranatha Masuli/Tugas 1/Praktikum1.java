import java.util.Scanner;

public class Praktikum1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jam;
        int km;
        System.out.print("masukkan waktu yang ditempuh :");
        System.out.print("masukkan kecepatan rata-rata :");
        jam = scan.nextInt();
        km = scan.nextInt();
        float bensin = jam*km/14f;
        System.out.print("total bensin yang digunakan :"+bensin+"L");
    }
}
