import java.util.Scanner;

public class TugasNomor2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int detik, jam, sisaDetik, menit, sekon;

        detik = user.nextInt();

        jam = detik / 3600;
        sisaDetik = detik % 3600;
        menit = sisaDetik / 60;
        sekon = sisaDetik % 60;

        System.out.printf("%02d:" , jam);
        System.out.printf("%02d:" , menit);
        System.out.printf("%02d" , sekon);

        user.close();
    }
}
