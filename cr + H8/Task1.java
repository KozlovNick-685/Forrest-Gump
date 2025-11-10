import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Введите число для индекса [" + i + "]");
			arr[i] = scan.nextInt();
		}
		int chet = 0;
		int nechet = 0;
		for(int i = 0; i < n; i++) {
			int num = arr[i];
			int cnt = 0;
			for(int j = 0; j < arr[i]; j++) {
				cnt++;
			}
			if (cnt % 2 == 0) {
				chet++;
			} else {
				nechet++;
			}
		}
		if (chet == nechet) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}