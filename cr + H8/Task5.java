import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		if (summ(arr[0]) == summ(arr[n - 1])) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}


	public static int summ(int x) {
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x = x / 10;
		}
		return sum;
	}
}