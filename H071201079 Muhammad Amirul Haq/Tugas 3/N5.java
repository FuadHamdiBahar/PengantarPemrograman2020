import java.util.Scanner;

public class N5 {
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);

        while(user.hasNextFloat()) {

           int jam, sisaDetik, menit, sekon;

           float derajat = user.nextFloat();

           float detik = derajat*86400.0f/360.0f;

           jam = ((int) detik / 3600 + 6) % 24;
           sisaDetik = (int) detik % 3600;
           menit = sisaDetik / 60;
           sekon = sisaDetik % 60;

           if(derajat < 90) {
               System.out.println("Selamat Pagi");
           } else if(derajat >= 90 && derajat < 135) {
               System.out.println("Selamat Siang");
           } else if(derajat >= 135 && derajat < 180) {
               System.out.println("Selamat Sore");
           } else if(derajat >= 180 && derajat < 315) {
               System.out.println("Selamat Malam");
           } else {
               System.out.println("Selamat Pagi");
           }

           System.out.printf("%02d:" , jam);
           System.out.printf("%02d:" , menit);
           System.out.printf("%02d\n" , sekon);

        }

        user.close();
    }
}
