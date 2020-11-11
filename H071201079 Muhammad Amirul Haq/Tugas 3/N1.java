import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        int x = user.nextInt();
        int y = user.nextInt();

        String ket1 = "genap";
        String ket2 = "positive";

        if(x < y) {

            while(x <= y) {
            
                if(x != 0) {

                    if(x % 2 == 0) {
                        ket1 = "genap";
                    } else {
                        ket1 = "ganjil";
                    }

                    if(x > 0) {
                        ket2 = "positive";
                    } else {
                        ket2 = "negatif";
                    }

                    System.out.println(x + " " + ket1 + " " + ket2);

                } else {
                    System.out.println(x + " nol");
                }

                x++;
            }

        } else {

            while(y <= x) {
            
                if(y != 0) {

                    if(y % 2 == 0) {
                        ket1 = "genap";
                    } else {
                        ket1 = "ganjil";
                    }

                    if(y > 0) {
                        ket2 = "positive";
                    } else {
                        ket2 = "negatif";
                    }

                    System.out.println(y + " " + ket1 + " " + ket2);

                } else {
                    System.out.println(y + " nol");
                }

                y++;
            }
            
        }
        user.close();
    }
}