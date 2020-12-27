import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kalimat = scan.nextLine();

        for (String[] a : matriks(gabungan(kalimat))) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    public static String gabungan(String kalimat){
        int code = 0;
        String gabung = "";
        for (int i = 0; i < kalimat.length(); i++) {
            if (i % 2 == 0) {
                gabung += kalimat.charAt(i);
            } else {
                code = Character.codePointAt(kalimat, i);
                gabung += code;
            }
        }
        while (gabung.length() % 16 != 0) {
            gabung += "?";
        }
        return gabung;
    }

    public static String[][] matriks(String gabung){
        int bagi = gabung.length() / 16;
        String[] n = new String[16];
        int k = 0;
        char[] charKu = gabung.toCharArray();
        for (int i = 0; i < n.length; i++) {
            n[i] = "";
        }

        for (int i = 0; i < n.length; i++) {
            while (k < bagi) {
                n[i] += charKu[k];
                k++;
            }
            bagi += gabung.length() / 16;
        }

        String[][] matriks = new String[4][4];

        for (int i = 0; i < matriks.length; i++) {

            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] = "";
            }
        }

        k = 0;
        for (int i = 0; i < matriks.length; i++) {

            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j] += n[k];
                k++;
            }
        }
        return matriks;
    }
    
}
