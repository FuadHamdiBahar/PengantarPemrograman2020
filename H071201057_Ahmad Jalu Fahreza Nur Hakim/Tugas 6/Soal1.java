import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j1, j2, h2;
        String noSpasi, kata, hexa, octal;
        kata = scan.nextLine();

        scan.close();

        noSpasi = kata.replaceAll("\\s+", "");
        j1 = kata.length();
        j2 = noSpasi.length();

        h2 = kata.length() * kata.length();
        hexa = String.format("%x", h2); 
        octal = String.format("%o", j1); 

        System.out.print("#" + hexa);

        for (int i = 0; i < j2 / 2; i++) { 
            kata = noSpasi.toUpperCase();
            System.out.print(kata.charAt(i));
        }
        for (int j = (j2 / 2) - 2; j >= 0; j--) { 
            kata = noSpasi.toUpperCase();
            System.out.print(kata.charAt(j));
        }

        System.out.print(octal); 

        if (Character.isDigit(hexa.charAt(0))) { 
            System.out.println("!");
        } else {
            System.out.println("?");
        }

    }
}