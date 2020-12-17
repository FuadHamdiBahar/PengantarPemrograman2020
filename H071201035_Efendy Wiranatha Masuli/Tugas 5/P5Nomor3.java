import java.util.Scanner;

class P5Nomor3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int days = obj.nextInt();
		myDay(days);
	}

	static void myDay(int x) {
		int years = x / 360;
		int months = (x % 360) / 30;
		int days = (x % 360) % 30;
		System.out.printf("%d tahun\n%d bulan\n%d hari", years, months, days);
	}
}