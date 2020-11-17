import java.util.Scanner;
public class Praktikum3No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            float m = input.nextFloat();
            int jam = 0;
            int menit = 0;
            int detik = 0;
            int dawal = (int) (m * 240);    //dawal=detik awal

            if(m >= 0 && m < 360) {
                while (dawal > 0) {
                    if(dawal - 3600 >= 0) {
                        dawal -= 3600;
                        jam++;
                    }else if (dawal - 60 >= 0) {
                        dawal -= 60;
                        menit++;
                    }else {
                        dawal -= 1;
                        detik++;
                    }
                } jam += 6;
                if(jam >= 24)
                    jam -= 24;
                if(jam <= 10) {
                    System.out.println("Selamat Pagi");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }else if (jam <= 14) {
                    System.out.println("Selamat Siang");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }else if (jam <= 18) {
                    System.out.println("Selamat Sore");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }else {
                    System.out.println("Selamat Malam");
                    System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
                }
            }else {
                System.out.println("Harap Massukkan Nilai 0<=Nilai<360");
            }
        } 
    }
    
}
