import java.util.Scanner;
public class Praktikum3No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Inputan X dan Inputan Y");
        int X = input.nextInt();
        int Y = input.nextInt();
        if (X > Y) {
            System.out.println("Inputan Tidak Valid");
        }else {
            for(int i = 1; i <= Y; i++) {
                System.out.print(i + " ");
                if (i % X == 0) {
                    System.out.println();
                }

        }
            
        }

    }
    
}
