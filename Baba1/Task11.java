import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int a = myScanner.nextInt();
		int k = 1;
		int i = 0;
		while (a > 0) {
			i += a % 10 * k;
			k *= 2;
			a /= 10;
		}
		System.out.println(i);
	}	
}