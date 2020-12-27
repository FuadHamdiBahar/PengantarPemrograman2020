import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.println(myDay(day));
        scan.close();

    }

    public static String myDay(int day){
        int tahun = day / 365;
        day = day % 365;
        int bulan =  day / 30;
        int hari = day % 30;
        
        return tahun + " Tahun\n" + bulan + " Bulan\n" + hari +" Hari\n";
    }
}
