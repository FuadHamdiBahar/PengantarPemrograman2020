import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();

		int[][] matrixA = new int[i][j];
		int[][] matrixB = new int[j][k];
		int[][] matrixC = new int[i][k];

        	for(int qq = 1; qq<=2; qq++){
		    for(int x=0; x<(qq==1?i:j); x++){
		        for(int y=0;y<(qq==1?j:k);y++){
				if(qq==1)
			        	matrixA[x][y] = scan.nextInt();
				else
					matrixB[x][y] = scan.nextInt();
		        }
		    }
        	}
		for (int m = 0; m < i; m++){
			for (int n = 0; n < k; n++){
				for (int o = 0; o < j; o++){
					matrixC[m][n] += matrixA[m][o] * matrixB[o][n];
				}
				System.out.print(matrixC[m][n] + " ");
			}
			System.out.println();
		}
	}
}