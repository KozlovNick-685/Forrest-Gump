import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		float x = myScanner.nextFloat();
		float y = myScanner.nextFloat();
		int n = myScanner.nextInt();
		if (((x <= n/2) && (x >= -n/2)) && ((y <= n/2) && (y >= -n/2))) {
			System.out.println("Точка находится в квадрате");
		} else {
			System.out.println("Точка вне квадрата");
		}
	}
}