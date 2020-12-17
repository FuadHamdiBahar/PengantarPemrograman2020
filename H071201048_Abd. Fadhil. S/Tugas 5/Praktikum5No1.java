import java.util.Scanner;
public class Praktikum5No1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Inputan Berupa Nilai Integer");
        int nilai1 = input.nextInt();
        int nilai2 = input.nextInt();
        int score = cariFPB(nilai1, nilai2);
        System.out.printf("FPB dari %d dan %d yaitu %d", nilai1, nilai2, score);
        
    } 
    static int cariFPB(int nilai1, int nilai2) {
        int FPB = 0;
        for(int i = 1; i <= nilai1 && i <= nilai2; i++) {
            if (nilai1 % i == 0 && nilai2 % i == 0)
            FPB = i;
        } 
        return FPB;
    }
}