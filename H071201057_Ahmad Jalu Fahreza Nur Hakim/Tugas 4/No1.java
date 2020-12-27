import java.util.Scanner;

public class No1{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];
        boolean relatifPrima = true;

        for(int i = 0 ;i < n;i++){
            array[i] = scan.nextInt();
        }
        for(int i =0;i < n;i++){
            for (int j = i + 1;j < n;j++){

                if (array[i] % array[j] == 0){
                    relatifPrima= false;
                }if(array[j] % array[i] == 0){
                    relatifPrima = false;
                }if(relatifPrima== true){
                    System.out.printf("%d %d\n",array[i],array[j]);
                }
            }
        }
        scan.close();
    }
}