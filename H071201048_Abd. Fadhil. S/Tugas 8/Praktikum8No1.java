import java.io.*;
import java.util.Scanner;

public class Praktikum8No1 {
    public static void main(String[] args) {
        System.out.println("Masukkan Inputan Anda!");
        Scanner scanner = new Scanner(System.in);
        FileInputStream in = null;
        FileOutputStream out = null;
        String input = scanner.next();
        String output = scanner.next();
        try {
            in = new FileInputStream("C:\\new\\"+input+".txt");
            out = new FileOutputStream("C:\\new\\"+output+".txt");
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            System.out.println("berhasil");
        }catch (IOException ioe) {
            System.out.println("gagal");
        }finally {
            try {
                if(in != null) {
                    in.close();
                }if (out != null) {
                    out.close();
                }
            }catch (IOException ioe) {
                System.out.println("gagal");
            }
        }
    }
    
}
