import java.util.Scanner;

public class Task10a {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int k = 1;
		while (n > 0) {
			if (n % 10 != 0) {
				System.out.print((n%10 * k) + (" + "));
			}
			n /= 10;
			k *= 10;
		}
	}
}