import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		if (name.matches("[А-Я][а-я]{1,14}")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}