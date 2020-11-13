import java.util.Scanner;

public class Miko4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int harga = user.nextInt();
        int uang = user.nextInt();

        int kembalian = uang - harga;

        int jumlahUang1 = (kembalian % 100000 % 50000 % 20000 % 10000 % 5000 % 2000) / 1000;
        int jumlahUang2 = (kembalian % 100000 % 50000 % 20000 % 10000 % 5000) / 2000;
        int jumlahUang5 = (kembalian % 100000 % 50000 % 20000 % 10000) / 5000;
        int jumlahUang10 = (kembalian % 100000 % 50000 % 20000) / 10000;
        int jumlahUang20 = (kembalian % 100000 % 50000) / 20000;
        int jumlahUang50 = (kembalian % 100000) / 50000;
        int jumlahUang100 = kembalian / 100000;

        System.out.println(jumlahUang100 + " uang 100000");
        System.out.println(jumlahUang50 + " uang 50000");
        System.out.println(jumlahUang20 + " uang 20000");
        System.out.println(jumlahUang10 + " uang 10000");
        System.out.println(jumlahUang5 + " uang 5000");
        System.out.println(jumlahUang2 + " uang 2000");
        System.out.println(jumlahUang1 + " uang 1000");
        
        user.close();
    }
}
    

