import java.util.Scanner;

public class Soal02 {
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);

      int menu, bangunDatar, bangunRuang;

      System.out.println("** Menu **");
      System.out.println("1. Mencari Luas Bangun Datar \n2. Mencari Volume Bangun Ruang \n");
      System.out.println("Input angka sesuai dengan Menu yang diinginkan :");

      menu = userInput.nextInt();

      switch (menu) {
         case 1:
            System.out.println("\n** Pilih Bangun Datar **");
            System.out.println(
                  "1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Trapesium\n7. Belah ketupat\n8. Layang-Layang\n");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan :");
            bangunDatar = userInput.nextInt();

            if (bangunDatar == 1) {
               // Persegi
               System.out.print("\nInput Sisi = ");
               float sisiP = userInput.nextFloat();
               // Rumus Luas Persegi
               float luasP = sisiP * sisiP;
               System.out.printf("Luas Persegi = %.1f", luasP);

            } else if (bangunDatar == 2) {
               // Persegi Panjang
               System.out.print("\nInput Panjang = ");
               float panjangPP = userInput.nextFloat();
               System.out.print("Input Lebar = ");
               float lebarPP = userInput.nextFloat();
               // Rumus Luas Persegi Panjang
               float luasPP = panjangPP * lebarPP;
               System.out.printf("Luas Persegi Panjang = %.1f", luasPP);

            } else if (bangunDatar == 3) {
               // Segitiga
               System.out.print("\nInput Alas = ");
               float alasS = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float tinggiS = userInput.nextFloat();
               // Rumus Luas Segitiga
               float luasS = (alasS * tinggiS) / 2;
               System.out.printf("Luas Segitiga = %.1f", luasS);

            } else if (bangunDatar == 4) {
               // Lingkaran
               System.out.print("\nInput Jari-Jari = ");
               float r = userInput.nextFloat();
               // Rumus Luas Lingkaran
               double luasL = (22 * Math.pow(r, 2)) / 7;
               System.out.printf("Luas Lingkaran = %.1f", luasL);

            } else if (bangunDatar == 5) {
               // Jajar Genjang
               System.out.print("\nInput Alas = ");
               float alasJG = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float tinggiJG = userInput.nextFloat();
               // Rumus Luas Jajar Genjang
               float luasJG = alasJG * tinggiJG;
               System.out.printf("Luas Jajar Genjang = %.1f", luasJG);

            } else if (bangunDatar == 6) {
               // Trapesium
               System.out.print("\nInput Alas = ");
               float alasT = userInput.nextFloat();
               System.out.print("Input Atas = ");
               float atasT = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float tinggiT = userInput.nextFloat();
               // Rumus Luas Trapesium
               float luasT = (alasT + atasT) / 2 * (tinggiT);
               System.out.printf("Luas Trapesium = %.1f", luasT);

            } else if (bangunDatar == 7 || bangunDatar == 8) {
               // Belah Ketupat dan Layang-Layang
               System.out.print("\nInput Diagonal 1 = ");
               float d1 = userInput.nextFloat();
               System.out.print("Input Diagonal 2 = ");
               float d2 = userInput.nextFloat();
               // Rumus Luas Belah Ketupat & Layang-Layang
               float luas = (d1 * d2) / 2;
               System.out.printf("Luas = %.1f", luas);

            } else
               System.out.println("Input Tidak Valid");
            break;

         case 2:
            System.out.println("\n** Pilih Bangun Ruang **");
            System.out.println(
                  "1. Kubus\n2. Balok\n3. Limas Segitiga\n4. Limas Segiempat\n5. Prisma Segitiga\n6. Bola\n7. Silinder\n8. Kerucut\n");
            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan :");
            bangunRuang = userInput.nextInt();

            if (bangunRuang == 1) {
               // Kubus
               System.out.print("\nInput Rusuk = ");
               float rusuk = userInput.nextFloat();
               // Rumus Volume Kubus
               double vKubus = Math.pow(rusuk, 3);
               System.out.printf("Volume Kubus = %.1f", vKubus);

            } else if (bangunRuang == 2) {
               // Balok
               System.out.print("\nInput Panjang = ");
               float panjangK = userInput.nextFloat();
               System.out.print("Input Lebar = ");
               float lebarK = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float tinggiK = userInput.nextFloat();
               // Rumus Volume Balok
               float vBalok = panjangK * lebarK * tinggiK;
               System.out.printf("Volume Balok = %.1f", vBalok);

            } else if (bangunRuang == 3) {
               // Limas Segitiga
               System.out.print("\nInput Alas = ");
               float alasLS = userInput.nextFloat();
               System.out.print("Input Tinggi Segitiga = ");
               float tinggi1LS = userInput.nextFloat();
               System.out.print("Input Tinggi Limas = ");
               float tinggi2LS = userInput.nextFloat();
               // Rumus Volume Limas Segitiga
               float vLimasSegitiga = (alasLS * tinggi1LS * tinggi2LS) / 6;
               System.out.printf("Volume Limas Segitiga = %.1f", vLimasSegitiga);

            } else if (bangunRuang == 4) {
               // Limas Segiempat
               System.out.print("\nInput sisi Alas 1 = ");
               float sisi1 = userInput.nextFloat();
               System.out.print("\nInput sisi Alas 2 = ");
               float sisi2 = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float t = userInput.nextFloat();
               // Rumus Volume Limas Segiempat
               float vLimasSegiempat = (sisi1 * sisi2 * t) / 3;
               System.out.printf("Volume Limas Segiempat = %.1f", vLimasSegiempat);

            } else if (bangunRuang == 5) {
               // Prisma Segitiga
               System.out.print("\nInput Alas Segitiga = ");
               float alasPrisma = userInput.nextFloat();
               System.out.print("Input Tinggi Segitiga = ");
               float tinggiPris1 = userInput.nextFloat();
               System.out.print("Input Tinggi Prisma = ");
               float tinggiPris2 = userInput.nextFloat();
               // Rumus Volume Prisma Segitiga
               float vPrisma = (alasPrisma * tinggiPris1 * tinggiPris2) / 2;
               System.out.printf("Volume Limas Prisma Segitiga = %.1f", vPrisma);

            } else if (bangunRuang == 6) {
               // Bola
               System.out.print("\nInput Jari-Jari = ");
               float rBola = userInput.nextFloat();
               // Rumus Volume Bola : 4/3 * 22/7 * r * r * r
               double vBola = (4 * 22 * Math.pow(rBola, 3)) / 21;
               System.out.printf("Volume Bola = %.1f", vBola);

            } else if (bangunRuang == 7) {
               // Silinder
               System.out.print("\nInput Jari-Jari = ");
               float rSilinder = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float tSilinder = userInput.nextFloat();
               // Rumus Volume Silinder
               double vSilinder = (22 * Math.pow(rSilinder, 2) * tSilinder) / 7;
               System.out.printf("Volume Silinder = %.1f", vSilinder);

            } else if (bangunRuang == 8) {
               // Kerucut
               System.out.print("\nInput Jari-Jari = ");
               float rKerucut = userInput.nextFloat();
               System.out.print("Input Tinggi = ");
               float tKerucut = userInput.nextFloat();
               // Rumus Volume Kerucut
               double vKerucut = (22 * Math.pow(rKerucut, 2) * tKerucut) / 21;
               System.out.printf("Volume Kerucut = %.1f", vKerucut);
            } else
               System.out.println("Input Tidak Valid");
            break;

         default:
            System.out.println("Input Tidak Valid");
            break;
      }
   }
}
