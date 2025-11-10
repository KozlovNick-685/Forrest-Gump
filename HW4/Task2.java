import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int n2 = scanner.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new.int[n2];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n2; j++) {
				arr1[i] = scanner.nextInt();
				arr2[j] = scanner.nextInt();
				System.out.println(arr1[i]);
				System.out.println(arr1[j]);
			}
		}
	}
}