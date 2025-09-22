import java.util.Scanner;

public class Task3 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		float a = myScanner.nextFloat();
		float b = myScanner.nextFloat();
		float c = myScanner.nextFloat();
		if ((a > b) && (a > c)) {
			System.out.println("Число " + a + " максимальное");
		} else if ((b > a) && (b > c)) {
			System.out.println("Число " + b + " максимальное");
		} else {
			System.out.println("Число " + c + " максимальное");
		}
	}
}