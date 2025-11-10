import java.util.Scanner;

public class Task3 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] < 0) {
				System.out.println("Тут, короче, отрицательное число");
				break;
		    }
		}
	}
}