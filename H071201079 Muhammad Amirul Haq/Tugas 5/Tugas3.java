import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String day = myDay(age);

        System.out.println(day);
        scanner.close();
    } 

    public static String myDay(int age){
        int year, month, day; 

        year= age / 365;
        age= age % 365; 
        month= age /30;
        day= age % 30;

        return year + " year \n" + month + " month \n" + day + " day \n";
    } 
} 