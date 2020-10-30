import java.util.Scanner;
public class Praktikum2Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("--Menu--");
            System.out.println("1.Mencari Luas Bangun Datar");
            System.out.println("2.Mencari Volume Bangun Ruang");
            System.out.println("Input angka sesuai menu yang diinginkan");
            int MenuUtama = input.nextInt();

            int Completion = 0;
            double Luas = 0.0;
            double Volume = 0.0;
            double Phi = 3.14159;
            String BangunDatar = "Bangun";
            String BangunRuang = "Ruang";

            if (MenuUtama == 1) {
                System.out.println("\n *Pilih Bangun Datar*");
            System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n");
            System.out.println("Input angka sesuai bangun datar pilihan");
            int MenuDatar = input.nextInt();

                if (MenuDatar == 1) {
                    BangunDatar = "Persegi";
                    System.out.println("\nInput Panjang Sisi");
                    double sisi = input.nextDouble();
                    Luas = sisi*sisi;
                    Completion++;
                }else if (MenuDatar == 2) {
                    BangunDatar = "Persegi Panjang";
                    System.out.println("\nInput Panjang");
                    double Panjang = input.nextDouble();
                    System.out.println("\nInput Lebar");
                    double Lebar = input.nextDouble();
                    Luas = Panjang*Lebar;
                    Completion++;
                }else if (MenuDatar == 3) {
                    BangunDatar = "Segitiga";
                    System.out.println("\nInput Alas");
                    double Alas = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Luas = Alas*Tinggi;
                    Completion++;
                }else if (MenuDatar == 4) {
                    BangunDatar = "Lingkaran";
                    System.out.println("\nInput Jari-Jari");
                    double JariJari = input.nextDouble();
                    Luas = Phi*(JariJari*JariJari);
                    Completion++;
                }else {
                    System.out.println("Maaf! Pilihan Anda Tidak Terdapat Dalam Menu");
                }
                if (Completion == 1) {
                    System.out.printf("\nLuas %s = %.1f\n", BangunDatar, Luas);
                }

            }else if (MenuUtama == 2) {
                System.out.println("\n *Pilih Bangun Ruang*");
                System.out.println("1. Kubus\n2. Balok\n3. Kerucut\n4. Bola\n");
                System.out.println("Input angka sesuai bangun ruang pilihan");
                int MenuRuang = input.nextInt();
    
                if (MenuRuang == 1) {
                    BangunRuang = "Kubus";
                    System.out.println("\nInput Panjang Sisi");
                    double Sisi = input.nextDouble();
                    Volume = Sisi*Sisi*Sisi;
                    Completion++;
                }else if (MenuRuang == 2) {
                    BangunRuang = "Balok";
                    System.out.println("\nInput Panjang Balok");
                    double Panjang = input.nextDouble();
                    System.out.println("\nInput Lebar Balok");
                    double Lebar = input.nextDouble();
                    System.out.println("\nInput Tinggi Balok");
                    double Tinggi = input.nextDouble();
                    Volume = Panjang*Lebar*Tinggi;
                    Completion++;
                }else if (MenuRuang == 3) {
                    BangunRuang = "Kerucut";
                    System.out.println("\nInput Jari-Jari");
                    double JariJari = input.nextDouble();
                    System.out.println("\nInput Tinggi");
                    double Tinggi = input.nextDouble();
                    Volume = (Phi*(JariJari*JariJari)*Tinggi)/3;
                    Completion++;
                }else if (MenuRuang == 4) {
                    BangunRuang = "Bola";
                    System.out.println("\nInput Jari-Jari");
                    double JariJari = input.nextDouble();
                    Volume = (4*Phi*(JariJari*JariJari*JariJari))/3;
                    Completion++;
                }else {
                    System.out.println("Maaf!Pilihan Anda Tidak Ada Dalam Menu");
                }
                if (Completion == 1) {
                    System.out.printf("\nVolume %s = %.1f\n", BangunRuang, Volume);
                }
            }else {
                System.out.println("Maaf!Pilihan Anda Tidak Terdapat Dalam Menu");
            }

        }catch (Exception e) {
            System.out.println("\nMaaf, Inputan Tidak Valid");
        }

        
    }
    
}
