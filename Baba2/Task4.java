import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int two = 2;
		int res = 0;
		int m = 1;
		for (int i = 1; i <= n; i++) {
			res += two * m;
			m *= 2;
			System.out.println(res); 
		}
	}
}