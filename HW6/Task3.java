import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int y = scan.nextInt();
		String glass = "aeuioAEUIO";
		String[][] arr = new String[n][y];
		scan.nextLine();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < y; j++) {
				System.out.println("Введите строку для индекса [" + i + "] [" + j + "]");
				arr[i][j] = scan.nextLine();
			}
		}
		int supercnt = 0;
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			boolean flag = false;
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < glass.length(); k++) {
					if (arr[j][i].charAt(arr[j][i].length() - 1) == glass.charAt(k)) {
						flag = true;
					}
				}
				if (flag) {
					cnt++;
					flag = false;
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
}