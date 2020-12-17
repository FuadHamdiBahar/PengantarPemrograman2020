import java.util.Scanner;
public class Praktikum4No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Inputan Anda");
        int n = input.nextInt();
        int[] nilai = new int[n];
        for(int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();      
         }

        for(int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int x = 0;
                for(int y =2; y <= (nilai[j] > nilai[i] ? nilai[i] : nilai[j]); y++) {
                     if(nilai[j] % y == 0 && nilai[i] % y == 0)
                        x = y;
                }
                if(x == 0)
                    System.out.printf("%d %d\n", nilai[i],nilai[j]);
                
            }
        }
    }
    
}
