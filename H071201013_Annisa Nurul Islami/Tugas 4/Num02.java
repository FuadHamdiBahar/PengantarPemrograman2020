import java.util.Scanner;

public class Num02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int i = obj.nextInt();
		int j = obj.nextInt();
		int k = obj.nextInt();
		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];
		int[][] matriksC = new int[i][k];
		int total = 0;

		System.out.println("Input Matriks A :");
		for (int x=0; x<matriksA.length; x++) {
			for (int y=0; y<matriksA[x].length;y++) {
				matriksA[x][y] = obj.nextInt();
			}
		}	
		System.out.println("Input Matriks B :");
		for (int x=0; x<matriksB.length; x++) {
			for (int y=0; y<matriksB[x].length; y++) {
				matriksB[x][y] = obj.nextInt();
		    }
        } 
        for (int x=0; x<i; x++) {
	    	for (int y=0; y<k; y++) {
	    		for (int z=0; z<j; z++) {
	    			total = total + matriksA[x][z]*matriksB[z][y];
	    		}
	    	    matriksC[x][y] = total;
	    	    total = 0;
	    	}
	    }
        System.out.println("Hasil Perkalian Matriks A dan Matriks B :");
        for (int x=0; x<i; x++) {
        	for (int y=0; y<k; y++) {
        		System.out.print(matriksC[x][y] + " ");
        	}
            System.out.println();
        }	
    }
}
