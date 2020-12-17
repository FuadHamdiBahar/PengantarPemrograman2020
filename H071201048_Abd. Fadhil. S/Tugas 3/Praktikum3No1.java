import java.util.Scanner;
public class Praktikum3No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai X dan Y");
        int X = input.nextInt();
        int Y = input.nextInt();
        
        if(X > Y) {
            int tempt = X;
            X = Y;
            Y = tempt;
        }
        for (int i = X; i <= Y; i++) {
            if(i%2 == 0 && i > 0) {
                System.out.println(i + " genap positif");
            }else if(i%2 == 0 && i < 0) {
                System.out.println(i + " genap negatif");
            }else if(i%2 == 1 && i > 0) {
                System.out.println(i + " ganjil positif");
            }else if(i%2 == -1 && i < 0) {
                System.out.println(i + " ganjil negatif");
            }else if(i == 0) {
                System.out.println(i + " nol");
            }
         
            
        }

    }
}
