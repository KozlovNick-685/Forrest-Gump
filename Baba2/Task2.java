public class Task2 {
	public static void main(String[] args) {
		int n = 2;
		int m = 1;
		for(int i = 1; i <= 10; i++) {
			int res = n * m;
			System.out.println(n + " * " + m + " = " + res);
			m++;
			if (i == 10) {
				i = 0;
				n++;
				m = 1;
				res = n * m;
				System.out.println("");
			} else if (n == 10) {
				break;
			}
		}
	}
}