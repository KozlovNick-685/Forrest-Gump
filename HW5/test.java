import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int reverse = 0;
		while (n > 0) {
			int num = n % 10;
			reverse = reverse * 10 + num;
			n = n / 10;
		}
		System.out.println(reverse);
	}
}