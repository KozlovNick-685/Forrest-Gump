import java.util.Scanner;

public class Task9 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int a = myScanner.nextInt();
		int b = 0;
		while (a > 0) {
			int c = a % 10;
			b = b + c;
			a = (a / 10);
		}
		System.out.println(b);
	} 
}