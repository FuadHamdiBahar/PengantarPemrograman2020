import java.util.Scanner;

public class ArrayNo2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int o = obj.nextInt();
		int p = obj.nextInt();
		int q = obj.nextInt();
		int[][] matriksA = new int[o][p];
		int[][] matriksB = new int[p][q];
		int[][] hasil = new int[o][q];
		int total = 0;

		System.out.println("Masukkan Matriks A");
		for (int i = 0;i < matriksA.length ;i++) {
			for (int j = 0;j < matriksA[i].length ;j++) {
				matriksA[i][j] = obj.nextInt();
			}
		}	
		System.out.println("Masukkan Matriks B");
		for (int i = 0;i < matriksB.length ;i++) {
			for (int j = 0;j < matriksB[i].length ;j++) {
				matriksB[i][j] = obj.nextInt();
		    }
        }   	
	    for (int i = 0; i < o; i++) {
	    	for (int j = 0; j < q; j++) {
	    		for (int k = 0; k < p; k++) {
	    			total = total + matriksA[i][k] * matriksB[k][j];
	    		}
	    	    hasil[i][j] = total;
	    	    total = 0;
	    	}
	    }
        System.out.println("Hasil Dari Perkalian Matriks: ");
        for (int i = 0; i < o; i++) {
        	for (int j = 0; j < q; j++) {
        		System.out.print(hasil[i][j] + " ");
        	}
            System.out.println();
        }
    }	
}

