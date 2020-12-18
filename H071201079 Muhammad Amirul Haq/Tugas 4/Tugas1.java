import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        
        int n = scanner.nextInt();
        int[] array=new int[n];

        for (int i=0; i<n; i++){
            array[i]= scanner.nextInt();
        }
        for(int i=0; i<n; i++) {

            for(int j= i+1; j<n; j++) {

                int a=0;
                for(int k=2; k <= (array[j] > array[i] ? array[i] : array[j]); k++) {
                    if (array[j] % k==0 && array[i] % k==0) a=k;
                }
                
                if (a==0) System.out.printf(" %d %d \n", array[i], array[j]);
            }
        }

        scanner.close();
    }
}
