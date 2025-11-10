import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		float summ = 0;
		for(int i = 1; i <= n; i++) {
			summ += ((float)(step(x, 3*i - 1)) / (fac(2*i) + i));
		}
		System.out.println(summ);







	}
	public static int step(int x, int s) {
		int st = 1;
		for(int i = 0; i < s; i++) {
			st *= x;
		}
		return st;
	}

	public static int fac(int x) {
		int p = 1;
		for(int i = 1; i <= x; i++) {
			p *= i;
		}
		return p;
	}
}