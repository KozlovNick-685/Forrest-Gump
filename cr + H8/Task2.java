import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		float summ = 0;
		for(int k = 1; k <= n; k++) {
			if (k % 2 == 0) {
				summ += ((float)(k * pow(x, k + 2)) / (f(k + 1)));
			} else {
				summ += ((float)(-1 * (k * pow(x, k + 2))) / (f(k + 1)));
			}
		}
		System.out.println(summ);
	}
	public static int pow(int x, int p) {
		int pow = 1;
		for(int i = 0; i < p; i++) {
			pow *= x; 
		}
		return pow;
	}
	public static int f(int x) {
		int result = 1;
		for(int i = 1; i <= x; i++) {
			result *= i;
		}
		return result;
	}
}