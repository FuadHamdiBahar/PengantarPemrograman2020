import java.util.Scanner;

public class Num03 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        int day = age.nextInt();
        
        myDay(day);
    }
    public static void myDay(int myAge) {
        int year = myAge / 365;
        int month = (myAge % 365) / 30;
        int day = (myAge % 365) % 30;

        System.out.printf("%d tahun\n%d bulan\n%d hari", year, month, day);
    }
}
