import java.util.Scanner;

public class cl1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите текст: ");
		String str = scan.nextLine();
		System.out.println("1. Найти подстроку");
		System.out.println("2. Заменить подстроку");
		System.out.println("3. Разбить строку на слова");
		System.out.println("4. Объединить слова в строку");
		System.out.println("0. Выход");
		char command = scan.nextLine().charAt(0);
		switch (command){
			case '1' -> {
				//System.out.print("Введите подстроку: ");
				//String podstr = scan.nextLine();
				//int index = position(podstr, str);
				//if (index == -1) {
				//	System.out.println("Нет такой подстроки");
				//} else {
				//	System.out.println("Найдено в позиции: " + index);
				//}
			}
			case '2' -> System.out.println("Введите подстроку для замены: ");
			case '3' -> System.out.println("");
			case '4' -> joinWords()
			case '0' -> System.out.println("Йоу");
		}
	}
	public static int joinWords(Scanner scan) {
		System.out.print("Введите слова через запятую: ");
		String str = scan.nextLine();
		String result = "";
	    for(int i = 0; i < str.length(); i++) {
	    	if(str.charAt(i) != ',') {
	    		result += str.charAt(i);
	    	} else {
	    		result += ' ';
	    	}
	    }
	    System.out.println("Результат: " + result);
	    return result;
	}
}