import java.util.Scanner;

public class Miko2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Masukan X =");
        int x = read.nextInt();

        System.out.println("Masukan Y =");
        int y = read.nextInt();

        System.out.println(" ");

        int i = 0;
        while(i < y){
            i++;
            if(i % x == 0);{
                System.out.println(i);
               }
            if(i % x !=0){
               System.out.println(i + " ");{

               }
           }
          read.close();
    }


}
}

