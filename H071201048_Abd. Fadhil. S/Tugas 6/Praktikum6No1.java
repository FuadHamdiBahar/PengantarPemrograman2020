import java.util.Scanner;
public class Praktikum6No1 {
    public static void main(String[] args) {
        System.out.println("Masukkan Inputan!");
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine().toUpperCase();
        System.out.print("#" + hexadecimal(kata) + palindromString(kata) + octal(kata));

        char hexChar = String.valueOf(hexadecimal(kata)).charAt(0);
        if (hexChar >= 'a' && hexChar <= 'z') {
            System.out.print("?");
        }else {
            System.out.print("!");
        }
    }
    static String Word(String a) {
        String newword = a.replaceAll(" " , "");
        int lengthword = newword.length() / 2;
        newword = newword.substring(0, lengthword);
        return newword;
    }
    static String palindromString(String a) {
        String kata = Word(a);
        String Palindrome = "";
        for (int i = kata.length() - 2; i >= 0; i--) {
            Palindrome += kata.charAt(i);
        }
        String newword = kata.concat(Palindrome);
        return newword;
    }
    static String hexadecimal(String a) {
        int lengthword = a.length();
        int decimal = lengthword * lengthword;
        String hexa = String.format("%x", decimal);
        return hexa;
    }
    static String octal(String a) {
        int lengthword = a.length();
        String octa = String.format("%o", lengthword);
        return octa;
    }
    
}
