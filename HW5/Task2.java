import java.util.Scanner;

public class Task2 {
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
		for(int j = 0; j < y; j++) {
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int supercnt = 0;
		for(int j = 0; j < y; j++) {
			int summFirst = 0;
			int massFirst = arr[0][j];
			while (massFirst > 0) {
				summFirst = summFirst + (massFirst % 10);
				massFirst = massFirst / 10;
			}
			int cnt = 0;
			for(int i = 1; i < n; i++) {
				int summOst = 0;
				int massOst = arr[i][j];
				while (massOst > 0) {
					summOst = summOst + (massOst % 10);
					massOst = massOst / 10;
				}
				if (summOst == summFirst) {
					cnt++;
				} else {
					break;
				}
			}
			if (cnt == n - 1) {
				supercnt++; 
			}
		}
		if (supercnt > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}