import java.util.Scanner;
import java.io.*;
class Soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        BufferedReader buffer = null;
        FileReader file = null;
        FileWriter fWriter = null;
        PrintWriter pWriter = null; 

        try {
            String asli = scan.next();
            String salinan = scan.next();
            scan.close();
            file = new FileReader(asli + ".txt");
            buffer = new BufferedReader(file);
            fWriter = new FileWriter(salinan + ".txt");
            pWriter = new PrintWriter(fWriter);
            String read;
            int max = 0;

            while ((read = buffer.readLine()) != null) {
                max = read.length() > max ? read.length() : max ;
            }

            file = new FileReader(asli + ".txt");
            buffer = new BufferedReader(file);

            String check;
            while ((check = buffer.readLine()) != null) {
                pWriter.write(String.format("%" + "max" + "s\n", check));
            }

        } catch (IOException ioe) {
            System.out.println("berhasil");
        } finally {
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
                if (pWriter != null) {
                    pWriter.close();
                }
                if (buffer != null) {
                    System.out.println("gagal");
                    buffer.close();
                }
                if (file != null) {
                    file.close();
                }    
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}