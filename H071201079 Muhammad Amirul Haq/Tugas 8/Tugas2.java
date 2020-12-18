import java.io.*;
import java.util.Scanner;

public class Tugas2 {
   public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner (System.in);

        FileWriter dataWrite = null;
        PrintWriter printWriter = null;
        FileReader dataRead = null;
        BufferedReader bufferedRead = null;

        try {

            String dataSatu = scanner.next();                                            
            String dataDua = scanner.next();            
 
            scanner.close();

            dataRead = new FileReader(String.format("%s.txt",dataSatu));
            bufferedRead = new BufferedReader(dataRead);
            dataWrite = new FileWriter(String.format("%s.txt", dataDua));
            printWriter = new PrintWriter(dataWrite);

            String text;
            int x = 0;

            while ((text = bufferedRead.readLine()) != null) {
                if (text.length() > x){
                x=text.length();
            }
        }

        dataRead = new FileReader(String.format("%s.txt",dataSatu));
        bufferedRead = new BufferedReader(dataRead);

        String text1;

        while ((text1 = bufferedRead.readLine()) != null) {
            printWriter.write(String.format("%"+ x +"s\n", text1));
        }

        } catch (IOException ioe) {
            System.out.println("GAGAL");

        } finally {

            try {
                if (dataWrite != null){
                System.out.println("BERHASIL");
                dataWrite.close();
            } 

            if (dataRead != null){
               dataRead.close();
            }

            } catch (IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
}  