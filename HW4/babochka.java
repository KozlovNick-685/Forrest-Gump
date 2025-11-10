import java.util.Scanner;

public class babochka {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for(int stolbec = 0; stolbec < n; stolbec++) {
			for(int stroka = 0; stroka < n; stroka++) {
				int cnt = n - stolbec * 2;
			}
		}
	}
}