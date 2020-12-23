import java.util.Scanner;
import java.util.ArrayList;

public class PP7 {
   // Deklarasi jenis-jenis/nama ArrayList agar bisa diakses secara umum
   public static ArrayList<String> judul = new ArrayList<>();
   public static ArrayList<String> rilis = new ArrayList<>();
   public static ArrayList<String> durasi = new ArrayList<>();
   public static ArrayList<String> genre = new ArrayList<>();
   public static ArrayList<String> sinopsis = new ArrayList<>();
   public static ArrayList<String> cast = new ArrayList<>();

   public static void main(String[] args) {
      // Isian data ke-1
      judul.add("Avenger: Endgame");
      rilis.add("24 April 2019");
      durasi.add("3 jam 1 menit");
      genre.add("Adventure, Sci-Fi, Action");
      sinopsis.add("\"Ini adalah sinpsis\"");
      cast.add("Robert Downey Jr., Chris Evan, Mark Ruffalo");
      // Isian data ke-2
      judul.add("Spiderman: Far From Home");
      rilis.add("02 Juli 2019");
      durasi.add("2 jam 9 menit");
      genre.add("Adventure, Sci-Fi, Action");
      sinopsis.add("\"Ini adalah sinpsis\"");
      cast.add("Tom Holland, Samuel L. Jackson, Zendaya");
      // Isian data ke-3
      judul.add("Venom");
      rilis.add("05 Oktober 2018");
      durasi.add("1 jam 52 menit");
      genre.add("Adventure, Sci-Fi, Action");
      sinopsis.add("\"Ini adalah sinpsis\"");
      cast.add("Tom Hardy, Michelle Williams, Riz Ahmed");
      // Isian data ke-4
      judul.add("Thor: Ragnarok");
      rilis.add("17 April 2011");
      durasi.add("1 jam 54 menit");
      genre.add("Adventure, Sci-Fi, Action");
      sinopsis.add("\"Ini adalah sinpsis\"");
      cast.add("Chris Hemsworth, Natalie Portman, Tom Hiddleston");
      list();

      // Inputan user
      Scanner obj = new Scanner(System.in);
      while (obj.hasNext()) {
         String opsi = obj.next();
         if (opsi.equalsIgnoreCase("d")) {
            int numD = obj.nextInt();
            detail(numD);
         } else if (opsi.equalsIgnoreCase("s")) {
            String kataKunci = obj.next();
            search(kataKunci);
         } else if (opsi.equalsIgnoreCase("a")) {
            add();
         } else if (opsi.equalsIgnoreCase("r")) {
            int list = obj.nextInt();
            remove(list);
         } else {
            System.out.println("(i) Input Alfabet Sesuai Pada Menu");
         }
      }
   }

   // =============== LIST ===============
   public static void list() {
      System.out.println("Favourite Movie");
      for (int list = 0; list < judul.size(); list++) {
         System.out.println((list + 1) + ". " + judul.get(list));
      }
      // Keterangan
      System.out.println("(d)Detail   (s)Search   (a)Add   (r)Remove");
   }

   // =============== DETAIL ===============
   public static void detail(int index) {
      index--;
      System.out.println("Judul\t\t: " + judul.get(index));
      System.out.println("Rilis\t\t: " + rilis.get(index));
      System.out.println("Durasi\t\t: " + durasi.get(index));
      System.out.println("Genre\t\t: " + genre.get(index));
      System.out.println("Sinopsis\t: " + sinopsis.get(index));
      System.out.println("Cast\t\t: " + cast.get(index));
      System.out.println();
      list();
   }

   // =============== SEARCH ===============
   public static void search(String kataKunci) {
      for (int list = 0; list < judul.size(); list++) {
         if (judul.get(list).contains(kataKunci)) {
            System.out.println((list + 1) + ". " + judul.get(list));
         }
      }
      System.out.println();
      list();
   }

   // =============== ADD ===============
   public static void add() {
      Scanner objAdd = new Scanner(System.in);
      System.out.print("Judul\t\t: ");
      judul.add(objAdd.next());
      System.out.print("Rilis\t\t: ");
      rilis.add(objAdd.next());
      System.out.print("Durasi\t\t: ");
      durasi.add(objAdd.next());
      System.out.print("Genre\t\t: ");
      genre.add(objAdd.next());
      System.out.print("Sinopsis\t: ");
      sinopsis.add(objAdd.next());
      System.out.print("Cast\t\t: ");
      cast.add(objAdd.next());
      System.out.println();
      list();
   }

   // =============== REMOVE ===============
   public static void remove(int index) {
      judul.remove(index - 1);
      System.out.println();
      list();
   }
}