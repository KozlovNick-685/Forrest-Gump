import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] massiv = new int[n];
		int max = massiv[0];
		for (int i = 0; i < n; i++) {
			massiv[i] = scanner.nextInt();
			if (massiv[i] > max) {
				max = massiv[i];
			}
		}
	System.out.println("Максимальное число: " + max);
	}
}