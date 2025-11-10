import java.util.Scanner;

public class Task4 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int stroka = scanner.nextInt();
		int stolb = scanner.nextInt();
		int count = 0;
		int num;
		int[][] array = new int[stroka][stolb];
		for(int i = 0; i < stroka; i++) {
			for(int j = 0; j < stolb; j++) {
				System.out.println("Введи число для индекса [" + stroka + "] [" + stolb + "]");
				array[i][j] = scanner.nextInt();
			}
		}
		int sum;
		int finallyCount = 0;
		for(int i = 0; i < stroka; i++) {
			sum = 0;
			for(int j = 0; j < stolb; j++) {
				num = array[i][j];
				while (num > 0){
					sum += num % 10;
					num /= 10;
				}
				if (sum == 10){
					count++;
				}
				if (count > 1){
					break;
				}
			}
			finallyCount++;
			count = 0;
		}
		if (finallyCount == stroka){
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}