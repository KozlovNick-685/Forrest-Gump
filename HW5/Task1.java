import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Введите число для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}
		int supercnt = 0;
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				int reverse = 0;
				while (arr[i][j] > 0) {
					int num = arr[i][j] % 10;
					reverse = reverse * 10 + num;
					arr[i][j] = arr[i][j] / 10;
					if (reverse == arr[i][j]) {
					cnt++;
				    }
				}
			}
			if (cnt == 1) {
				supercnt++;
			} else {
				System.out.println("False");
				break;
			}
		}
		if (supercnt == n) {
			System.out.println("True");
		}
	}
}