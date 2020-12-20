import java.io.*;
import java.util.Scanner;
class Nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        FileInputStream in = null;
        FileOutputStream out = null;
        File isChecked = null;
         

        try {
            String inputan1 = sc.nextLine();
            String inputan2 = sc.nextLine();
            sc.close();
            in = new FileInputStream(String.format("%s.txt", inputan1));
            out = new FileOutputStream(String.format("%s.txt", inputan2));
            isChecked = new File(String.format("%s.txt", inputan1));
            int read;
            while ((read = in.read()) != -1) {
                out.write(read);
            }
            if (isChecked.exists()) {
                System.out.println("gagal");
            } 
        } catch (IOException ioe) {
            System.out.println("berhasil");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
                
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}
