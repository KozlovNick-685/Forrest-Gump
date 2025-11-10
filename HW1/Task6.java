import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x = scanner.nextFloat();
		float y = scanner.nextFloat();
		int n = scanner.nextInt();
		if ((x*x + y*y) <= (n*n)) {
			System.out.println("Точка находится в окружности");
		} else {
			System.out.println("Точка вне окружности");
		}
	}
}