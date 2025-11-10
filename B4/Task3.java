import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}
		int supercnt = 0;
		int cntFalse = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int summ = 0;
				while (arr[i][j] > 0) {
					int chis = arr[i][j] % 10;
					summ += chis;
					arr[i][j] = arr[i][j] / 10;
				}
				if (summ % 5 == 0) {
					supercnt++;
				} 
			}
			if (supercnt >= 2) {
				System.out.println("True");
				break;
			} else {
				cntFalse++;
			}
		}
		if (cntFalse == n) {
			System.out.println("False");
		}
	}
}