import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		int n = scan.nextInt();
		int m = 1;
		float st = 1;
		float res = 0;
		for(int i = 1; i <= n; i++) {
			m *= i;
			res += (float)(m * (x * st));
			st *= x;
			System.out.println(res);
		}
	}
}