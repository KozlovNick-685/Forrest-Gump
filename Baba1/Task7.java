import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		float x = myScanner.nextFloat();
		float y = myScanner.nextFloat();
		if ((x*x + y*y) <= (1*1)) {
			System.out.println("Точка внутри круга 1");
		} else if ((x*x + y*y) <= (2*2)) {
			System.out.println("Точка внутри круга 2");
		} else if ((x*x + y*y) <= (3*3)) {
			System.out.println("Точка внутри круга 3");
		} else if ((x*x + y*y) <= (4*4)) {
			System.out.println("Точка внутри круга 4");
		} else if ((x*x + y*y) <= (5*5)) {
			System.out.println("Точка внутри круга 5");
		} else if ((x*x + y*y) <= (6*6)) {
			System.out.println("Точка внутри круга 6");
		} else if ((x*x + y*y) <= (7*7)) {
			System.out.println("Точка внутри круга 7");
		} else if ((x*x + y*y) <= (8*8)) {
			System.out.println("Точка внутри круга 8");
		} else if ((x*x + y*y) <= (9*9)) {
			System.out.println("Точка внутри круга 9");
		} else if ((x*x + y*y) <= (10*10)) {
			System.out.println("Точка внутри круга 10");
		} else {
			System.out.println("missed");
		}
	}
}