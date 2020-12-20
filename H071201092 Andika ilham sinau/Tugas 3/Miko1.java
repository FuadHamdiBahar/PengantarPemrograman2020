
import java.util.Scanner;

public class Miko1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Masukan input  X: ");
        int x = read.nextInt();

        System.out.println("Masukan input  Y: ");
        int y = read.nextInt();

        for(int i = x; i <= y; i++) {
            if(i < 0 && i % 2 == 0){
                System.out.println(i +" genap negatif ");
            }

            else if(i < 0 && i % 2 == i || i % 2 == -1){
                System.out.println(i +" ganjil negatif");
            }
            else if(i == 0){
                System.out.println(i +"nol");
            }
            else if(i > 0 && i % 2 == 1 || i % 2 == -1){
                System.out.println(i +"ganjil positif");
            }
            else if(i > 0 && i % 2 == 0){
                System.out.println(i +"genap ganjil");
            }
            else{
                System.out.println("Input salah");
            }
        }
          for(int j = y; j <= x; j++){
            if(j < 0 && j % 2 == 0){
                System.out.println(j +" genap negatif ");
            }

            else if(j < 0 && j % 2 == j || j % 2 == -1){
                System.out.println(j +" ganjil negatif");
            }
            else if(j == 0){
                System.out.println(j +"nol");
            }
            else if(j > 0 && j % 2 == 1 || j % 2 == -1){
                System.out.println(j +"ganjil positif");
            }
            else if(j > 0 && j % 2 == 0){
                System.out.println(j +"genap ganjil");
            }
            else{
                System.out.println("Input salah");
            }

        }
        read.close();
    }

}

            
         




        
        


        
        
        

        

        
    
    


        
        
        
    

