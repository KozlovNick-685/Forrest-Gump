import java.util.Scanner;

public class Task2 {
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
			supercnt = 0;
			for(int j = 0; j < n; j++) {
				int vhod = 0;
				int cnt = 0;
				while (arr[i][j] > 0) {
					vhod++;
					int chis = arr[i][j] % 10;
					if (chis % 2 == 0) {
						cnt += 1;
						arr[i][j] = arr[i][j] / 10;
					} else {
						break;
					}
				}
				if (cnt == vhod) {
					supercnt += 1;
				}
			}
			if (supercnt == 1) {
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