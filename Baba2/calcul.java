import java.util.Scanner;

public class Task0 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int chislo1 = myScanner.nextInt();
		int chislo2 = myScanner.nextInt();
		myScanner.nextLine();
		char command = myScanner.nextLine().charAt(0);
		switch (command) {
			case '+' -> System.out.println(sum(chislo1, chislo2));
			case '-' -> System.out.println(chislo1 - chislo2);
			case '*' -> System.out.println(chislo1 * chislo2);
			case '/' -> System.out.println(chislo1 / chislo2);
		}
	}


	public static int sum (int num1, int num2) {
		return num1 + num2;
	}
}