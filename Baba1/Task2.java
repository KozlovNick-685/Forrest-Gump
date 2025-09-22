import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		float a = myScanner.nextFloat();
		float b = myScanner.nextFloat();
		if (a > b) {
			System.out.println("Число " + a + " больше числа " + b);
		} else {
			System.out.println("Число " + b + " больше числа " + a);
		}
	}
}