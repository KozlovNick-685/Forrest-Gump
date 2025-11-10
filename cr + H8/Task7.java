import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int summ = 0;
		for(int i = 0; i < n; i++) {
			int[] arr = new int[n];
			for(int j = 0; j < n; j++) {
				arr[j] = scan.nextInt();
				if (arr[j] % 3 == 0) {
					summ += arr[j];
				}
			}
		}
		System.out.println(summ);
	}
}