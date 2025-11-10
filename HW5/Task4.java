import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int y = scan.nextInt();
		int[][] arr = new int[n][y];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Введите число для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}
		int supercnt = 0;
		int superpupercnt = 0;
		for(int i = 0; i < n; i++) {
			supercnt = 0;
			for(int j = 0; j < n; j++) {
				int x = arr[i][j];
				int cnt = 0;
				int vhod = 0;
				while (x > 0) {
					vhod++;
					int z = x % 10;
					x = x / 10;
					if (z > (x % 10)) {
						cnt++;
					} else {
						break;
					}
				}
				if ((cnt == vhod) && ((cnt + vhod) >= 4)) {
					supercnt++;
				}
			}
			if (supercnt == 2) {
				superpupercnt++; 
			}
		}
		if (superpupercnt == y) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}