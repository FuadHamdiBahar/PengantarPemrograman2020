import java.io.*;
import java.util.Scanner;
class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        FileInputStream asli = null;
        FileOutputStream salinan = null;
        File cek = null;


        try {
            String input1 = scan.nextLine();
            String input2 = scan.nextLine();
            scan.close();
            asli = new FileInputStream(String.format("%s.txt", input1));
            salinan = new FileOutputStream(String.format("%s.txt", input2));
            cek = new File(String.format("%s.txt", input1));

            int read;
            while ((read = asli.read()) != -1) {
                salinan.write(read);
            }
            if (cek.exists()) {
                System.out.println("gagal");
            } 
        } catch (IOException ioe) {
            System.out.println("berhasil");
        } finally {
            try {
                if (asli != null) {
                    asli.close();
                }
                if (salinan != null) {
                    salinan.close();
                }

            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}