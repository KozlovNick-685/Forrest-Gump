import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int y = scan.nextInt();
		int[][] arr = new int[n][y];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < y; j++) {
				System.out.println("Введите число для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}
		int supercnt = 0;
		for(int i = 0; i < n; i++){
			int cnt = 0;
			for(int j = 0; j < y; j++) {
				int x = arr[i][j];
				int summ = 0;
				while (x > 0) {
					summ = summ + (x % 10);
					x = x / 10;
				}
				if (prost(arr[i][j]) && prost(summ)) {
					cnt++;
				}
			}
			if (cnt >= 1) {
				supercnt++;
			}
		}
		if (supercnt == n) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	public static boolean prost(int x) {
		int chislo = x;
		int cnt = 0;
		for(int i = 1; i <= chislo; i++) {
			if (chislo % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) {
			return true;
		} else {
			return false;
		}
	}
}