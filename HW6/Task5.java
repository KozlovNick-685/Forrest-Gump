import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int y = scan.nextInt();
		String[][] arr = new String[n][y];
		scan.nextLine();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < y; j++) {
				System.out.println("Введите строку для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextLine();
			}
		}
		for(int j = 0; j < y; j++) {
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}