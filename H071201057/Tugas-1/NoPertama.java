import java.util.Scanner;
class NoPertama{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt(); // w = waktu tempuh
        int k = scan.nextInt(); // k = kecepatan rata-rata
        int efisiensi = 14; // efisiensi mobil = 14km/L

        scan.close();

        int j = (w * k); // j = jarak total
        float b = j / (float) efisiensi; // b = bahan bakar yang digunakan

        System.out.print("Bensin yang digunakan :");
        System.out.printf("%.3f",b);
        System.out.print(" L ");
    }
    

}