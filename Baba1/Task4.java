import java.util.Scanner;

public class Task4 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		float a = myScanner.nextFloat();
		float b = myScanner.nextFloat();
		if (a == b) {
			System.out.println("Число " + a + " равно числу " + b);
		} else {
			System.out.println("Не равны");
		}
	}	
}