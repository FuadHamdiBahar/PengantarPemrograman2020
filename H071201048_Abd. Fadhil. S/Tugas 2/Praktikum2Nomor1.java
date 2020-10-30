import java.util.Scanner;
public class Praktikum2Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        try {
            System.out.println("Masukkan 5 angka");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
    
            int genap = 0;
            int ganjil = 0;
            int positif = 0;
            int negatif = 0;
    
            //.......... a
            if(a % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            if(a > 0) {
                positif++;
            }else if (a < 0) {
                negatif++;
            }
            //.......... b
            if(b % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            if(b > 0) {
                positif++;
            }else if (b < 0) {
                negatif++;
            }
            //.......... c
            if(c % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            if(c > 0) {
                positif++;
            }else if (c < 0) {
                negatif++;
            }
            //........... d
            if(d % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            if(d > 0) {
                positif++;
            }else if (d < 0) {
                negatif++;
            }
            //........... e
            if(e % 2 == 0) {
                genap++;
            }else {
                ganjil++;
            }
            if(e > 0) {
                positif++;
            }else if (e < 0) {
                negatif++;
            }
                System.out.println(genap + " Angka Genap");
                System.out.println(ganjil + " Angka Ganjil");
                System.out.println(positif + " Angka Positif");
                System.out.println(negatif + " Angka Negatif");

        }catch (Exception e) {
            System.out.println("Maaf Inputan Tidak Valid!");
        }
           

    }
    
}
