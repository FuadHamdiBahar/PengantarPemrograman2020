import java.util.Scanner;

public class Soal01 {
   public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      String kalimat = obj.nextLine();
      System.out.println("#" + hexa(kalimat) + kataBaru(kalimat) + octal(kalimat) + simbol(kalimat));
   }

   static String kataBaru(String kalimat) {
      String kataBaru = kalimat.replace(" ", " ").toUpperCase();
      int kata = kataBaru.length() / 2;
      kataBaru = kataBaru.substring(0, kata);

      String palindrom = new StringBuffer(kataBaru).reverse().toString();
      palindrom = kataBaru.concat(palindrom);
      return palindrom;
   }

   static String hexa(String kalimat) {
      int n = kalimat.length() * kalimat.length();
      String hexa = Integer.toHexString(n);
      return hexa;
   }

   static String octal(String kalimat) {
      int n = kalimat.length();
      String octal = Integer.toOctalString(n);
      return octal;
   }

   static String simbol(String kalimat) {
      int n = kalimat.length() * kalimat.length();
      String simbol = Integer.toHexString(n);
      char[] charArray = simbol.toCharArray();
      if (charArray[0] >= 'a' && charArray[0] <= 'z') {
         simbol = "?";
         return simbol;
      } else {
         simbol = "!";
         return simbol;
      }
   }
}
