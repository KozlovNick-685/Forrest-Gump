import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int k = myScanner.nextInt();
		int a = 1;
		while (a != 9) {
			a++;
			int b = a * k;
			System.out.println(b);
		}
	}
}