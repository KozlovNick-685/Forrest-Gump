import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.print("Введите строку: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String result = "";
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				continue;
			} else if (c >= 'А' && c <= 'Я') {
				c = (char)(c + 32);
			}
			result += c;
		}
		for(int i = 0; i < (result.length() / 2); i++) {
			if (result.charAt(i) != result.charAt((result.length() - 1 - i))) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}