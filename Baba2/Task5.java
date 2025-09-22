import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = 0;
		int m = 1;
		for(int i = 1; i <= n; i++) {
			m *= i;
			res += m;
			System.out.println(res);
		}
	}
}