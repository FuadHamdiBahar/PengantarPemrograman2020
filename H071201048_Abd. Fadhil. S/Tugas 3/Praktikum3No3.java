import java.util.Scanner;
public class Praktikum3No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai ke-n");
        long n = input.nextLong();
        long fn1 = 1;
        long fn2 = 0;
        long fn = 1;
        
       System.out.print(fn2 + " " + fn1);

        for(long i = 2; i < n; i++) {
            fn = fn1 + fn2;
            System.out.print(" " + fn); 
            fn2 = fn1;
            fn1 = fn;
              
        }
        
        


    }
    
}
