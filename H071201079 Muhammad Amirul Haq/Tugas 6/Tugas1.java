import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlah1, jumlah2, hexa2;
        String tanpaSpasi, word, hexa, oktal;

        word = scanner.nextLine();
        
        // hilangkan spasi
        tanpaSpasi = word.replaceAll("\\s+", "");
        jumlah1 = word.length();
        jumlah2 = tanpaSpasi.length();

        hexa2 = word.length() * word.length();
         // ubah ke hexa
        hexa = String.format("%x", hexa2);
        // ubah ke oktal
        oktal = String.format("%o", jumlah1);

        // print hexa
        System.out.print("#" + hexa);

        // print setengah karakter
        for (int i = 0; i < jumlah2 / 2; i++) {
            word = tanpaSpasi.toUpperCase();
            System.out.print(word.charAt(i));
        }

        for (int j = (jumlah2 / 2) - 2; j >= 0; j--) {
            word = tanpaSpasi.toUpperCase();
            System.out.print(word.charAt(j));
        }

        // print oktal
        System.out.print(oktal);
        if (Character.isDigit(hexa.charAt(0))) { 
            System.out.println("!");

        } else System.out.println("?");

        scanner.close();
    }
} 