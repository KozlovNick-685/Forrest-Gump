import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[(n - 1) / 2][j] = 1;
				arr[i][(n -1) / 2] = 1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}