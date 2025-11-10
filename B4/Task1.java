import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int y = scan.nextInt();
		int[][] arr = new int[n][y];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < y; j++) {
				System.out.println("Введи число для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}
		int supercnt = 0;
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			for(int j = 0; j < y; j++) {
				if (arr[i][j] % 3 == 0) {
					cnt += 1;
				}
			}
			if (cnt == y) {
				supercnt += 1;
				cnt = 0;
			} else {
				cnt = 0;
			}
		}
		if (supercnt > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}