import java.util.*;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Rekomendasi Anime 2020 versi gw");

        judul.add("Sword Art Online : Alicization Season 2");
        rilis.add("13 Oktober 2019");
        genre.add("Action, Adventure, Fantasy, Game, Romance");
        sinopsis.add("MC kok AFK!!");
        durasi.add("23 Episode");
        cast.add("Mastuoka, Shimazaki, Kayano, Tomatsu, dkk");

        judul.add("Kanojo Okarishimasu");
        rilis.add("11 Juli 2020");
        genre.add("Comedy, Romance, School, Shounen");
        sinopsis.add("Ngerental Pacar");
        durasi.add("12 Episode");
        cast.add("Amamiya, Freeman, Horie, Kowaka, Sadaoka, dkk");

        judul.add("Oregairu Season 3");
        rilis.add("10 Juli 2020");
        genre.add("Comedy, Romance, School, Slice of Life");
        sinopsis.add("Dapat gebetan lewat klub sekolah");
        durasi.add("12 Episode");
        cast.add("Eguchi, Komatsu, Hayami, Yuuki, Touyama, dkk");

        judul.add("Enen No Shouboutai Season 2");
        rilis.add("4 Julu 2020");
        genre.add("Action, Shounen, Supernatural");
        sinopsis.add("Latom");
        durasi.add("24 Episode");
        cast.add("Nakai, Kajiwara, Suzumaru, Yuuki, Miyano, Kamijou, Tsuda, dkk");

        show();

            while (scan.hasNext()){
        char select = scan.next().charAt(0);
            switch (select) {
                case 'd':
                    int number = scan.nextInt();
                    detail(number);
                    break;

                case 'r':
                    int x = scan.nextInt();
                    remove(x);
                    show();
                    break;

                case 'a':
                    System.out.print("judul\t :");
                    add();
                    break;

                case 's' :
                    String nama = scan.next();
                    search(nama);
            }
        }
        scan.close();
    }

    public static void detail(int i) {
        i-=1;
        System.out.println("JUDUL    : " + judul.get(i));
        System.out.println("RILIS    : " + rilis.get(i));
        System.out.println("GENRE    : " + genre.get(i));
        System.out.println("DURASI   : " + durasi.get(i));
        System.out.println("SINOPSIS : " + sinopsis.get(i));
        System.out.println("CAST     : " + cast.get(i));
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t ctrl+c(selesai)\t");
    }

    public static void remove(int i) {
        judul.remove(i - 1);
        for (int x = 0; x < judul.size(); x++)
            System.out.println(judul.get(x));
            System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t ctrl+c(selesai)\t ");
    }

    public static void add() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" ");

        judul.add(scan.nextLine());
        System.out.print("RILIS\t :");

        rilis.add(scan.nextLine());
        System.out.print("DURASI\t :");

        durasi.add(scan.nextLine());
        System.out.print("GENRE\t :");

        genre.add(scan.nextLine());
        System.out.print("SINOPSIS :");

        sinopsis.add(scan.nextLine());
        System.out.print("CAST\t :");

        cast.add(scan.nextLine());
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t ctrl+c(selesai)\t");
    }
    public static void search(String nama) {
        for (int x = 0; x < judul.size(); x++) {
            if  (judul.get(x).contains(nama)) {
                System.out.println(x + 1+". "+judul.get(x));
            }
        }
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t ctrl+c(selesai)\t"); 
    }
    public static void show(){
        for(int x=0; x<judul.size();x++){
            System.out.println(x+1+". "+judul.get(x));
        }
        System.out.println("d(detail)\t s(search)\t r(remove)\t a(add)\t ctrl+c(selesai)\t");
    }

    public static List<String> judul = new ArrayList<String>();
    public static List<String> rilis = new ArrayList<String>();
    public static List<String> durasi = new ArrayList<String>();
    public static List<String> genre = new ArrayList<String>();
    public static List<String> sinopsis = new ArrayList<String>();
    public static List<String> cast = new ArrayList<String>();
}