import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("** Menu **");

        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");

        System.out.println("Input angka sesuai dengan menu yang diinginkan :");
        int menu = user.nextInt();
       
        switch (menu) {

            case 1:
            System.out.println("** Pilih Bangun Datar **");

            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-Layang");

            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
            int bangunDatar = user.nextInt();

            if(bangunDatar == 1) {

                System.out.println("Input Sisi");
                float sisiPersegi = user.nextInt();

                float luasPersegi = sisiPersegi * sisiPersegi;

                System.out.println("Luas Persegi = " + luasPersegi);

            } else if(bangunDatar == 2) {

                System.out.println("Input Panjang");
                float panjangPersegiPanjang = user.nextInt();

                System.out.println("Input lebar");
                float lebarPersegiPanjang = user.nextInt();

                float luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;

                System.out.println("Luas Persegi Panjang = " + luasPersegiPanjang);

            } else if(bangunDatar == 3) {

                System.out.println("Input Alas");
                float alasSegitiga = user.nextInt();

                System.out.println("Input Tinggi");
                float tinggiSegitiga = user.nextInt();

                float luasSegitiga = 1f/2f * alasSegitiga * tinggiSegitiga;

                System.out.println("Luas Segitiga = " + luasSegitiga);

            } else if(bangunDatar == 4) {

                System.out.println("Input Jari-Jari");
                float r = user.nextInt();

                float luasLingkaran = (float) Math.PI * r * r;

                System.out.println("Luas Lingkaran = " + luasLingkaran);

            } else if(bangunDatar == 5) {

                System.out.println("Input alas");
                float alasJajarGnejang = user.nextInt();

                System.out.println("Input tinggi");
                float tinggiJajarGnejang = user.nextInt();

                float luasJajarGenjang = alasJajarGnejang * tinggiJajarGnejang;

                System.out.println("Luas jajarGenjang = " + luasJajarGenjang);

            } else if(bangunDatar == 6) {

                System.out.println("Input sisi bawah");
                float sisiBawah = user.nextInt();

                System.out.println("Input sisi atas");
                float sisiAtas = user.nextInt();

                System.out.println("Input tinggi");
                float tinggiTrapesium = user.nextInt();

                float luasTrapesium = 1f/2f * (sisiBawah + sisiAtas) * tinggiTrapesium;

                System.out.println("Luas Trapesium = " + luasTrapesium);

            } else if(bangunDatar == 7) {

                System.out.println("Input diagonal 1");
                float d1 = user.nextInt();

                System.out.println("Input diagonal 2");
                float d2 = user.nextInt();

                float luasKetupat = 1f/2f * d1 * d2;

                System.out.println("Luas Belah Ketupat = " + luasKetupat);

            } else if(bangunDatar == 8) {

                System.out.println("Input diagonal 1");
                float diagonal1 = user.nextInt();

                System.out.println("Input diagonal 2");
                float diagonal2 = user.nextInt();

                float luasLayang2 = 1f/2f * diagonal1 * diagonal2;

                System.out.println("Luas layang-layang = " + luasLayang2);

            }
            break;

            case 2:
            System.out.println("** Pilih Bangun Ruang");

            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas");
            System.out.println("4. Kerucut");
            System.out.println("5. Prisma");
            System.out.println("6. Tabung");
            System.out.println("7. Bola");

            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan :");
            int bangunRuang = user.nextInt();

            if(bangunRuang == 1) {

                System.out.println("Input Rusuk");
                float rusuk = user.nextInt();

                float volumeKubus = rusuk * rusuk * rusuk;

                System.out.println("Volume Kubus = " + volumeKubus);

            } else if(bangunRuang == 2) {

                System.out.println("Input panjang");
                float pnjng = user.nextInt();

                System.out.println("Input lebar");
                float lbr = user.nextInt();

                System.out.println("Input tinggi");
                float tggi = user.nextInt();

                float volumeBalok = pnjng * lbr * tggi;

                System.out.println("Volume Balok = " + volumeBalok);

            } else if(bangunRuang == 3) {

                System.out.println("1. Limas Segiempat\n2. Limas Segitiga");
                float limas = user.nextInt();

                if(limas == 1) {
                    System.out.println("Input panjang alas");
                    float panjang = user.nextInt();
                    System.out.println("Input lebar alas");
                    float lebar = user.nextInt();
                    System.out.println("Input tinggi");
                    float tinggi = user.nextInt();

                    float volLimasSegiempat = 1f/3f * panjang * lebar * tinggi;

                    System.out.println("Volume Limas segiempat = " + volLimasSegiempat);
                } else if(limas == 2) {
                    System.out.println("Input alas segitiga");
                    float als = user.nextInt();
                    System.out.println("Input tinggi segitiga");
                    float tgi = user.nextInt();
                    System.out.println("Input tinggi limas");
                    float tinggi = user.nextInt();

                    float volLimasSegitiga = 1f/3f * 1f/2f * als * tgi * tinggi;
                    System.out.println("Volume Limas Segitiga = " + volLimasSegitiga);
                } else {
                    System.out.println("Input salah");
                }
            } else if(bangunRuang == 4) {

                System.out.println("Input jari-jari");
                float rKerucut = user.nextInt();

                System.out.println("Input tinggi");
                float tinggiKerucut = user.nextInt();

                float volumeKerucut = (float) (1f/3f * Math.PI * rKerucut * rKerucut * tinggiKerucut);

                System.out.println("Volume Kerucut = " + volumeKerucut);

            } else if(bangunRuang == 5) {

                System.out.println("Input panjang");
                float pnjngPrisma = user.nextInt();

                System.out.println("Input lebar");
                float lbrPrisma = user.nextInt();

                System.out.println("Input tinggi");
                float tggiPrisma = user.nextInt();

                float volumePrisma = 1f/2f * pnjngPrisma * lbrPrisma * tggiPrisma;

                System.out.println("Volume Prisma segitiga = " + volumePrisma);

            } else if(bangunRuang == 6) {

                System.out.println("Input jari-jari");
                float jari2Tabung = user.nextInt();

                System.out.println("Input tinggi");
                float tggiTabung = user.nextInt();

                float volumeTabung = (float) Math.PI * jari2Tabung * jari2Tabung * tggiTabung;

                System.out.println("Volume Tabung = " + volumeTabung);

            } else if(bangunRuang == 7) {

                System.out.println("Input jari-jari");
                float jari2Bola = user.nextInt();

                float volumeBola = 4f/3f * (float) Math.PI * jari2Bola * jari2Bola * jari2Bola;

                System.out.println("Volume Bola = " + volumeBola);

            }
            break;

            default:

            System.out.println("Input salah"); 
            break;

        }
        user.close();
    }
}
