import java.util.Scanner;

public class Task10 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int a = myScanner.nextInt();
		int n = 1;
		System.out.print(a + " = ");
		while (a > 0) {
			if (a % 10 != 0) {
				System.out.print(a % 10 * n);
			}
			a /= 10;
			n *= 10;
			if (a % 10 == 0) {
				break;
			} else {
				System.out.print(" + ");
			}
		}	
	} 
}