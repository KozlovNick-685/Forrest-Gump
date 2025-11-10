import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.print("Введите строку: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String result = "";
		int cntglass = 0;
		int max = 0;
		String finalword = "";
		for(int i = 0; i < str.length(); i++) {
			result += str.charAt(i);
			if ((str.charAt(i) == ' ') || (i == (str.length() - 1))) {
				cntglass += cntglas(result);
				if (cntglass > max) {
					max = cntglass;
					finalword = result;
					result = "";
					cntglass = 0;
				} else {
					result = "";
					cntglass = 0;
				}
			}
		}
		System.out.println(max);
		System.out.println(finalword);






	}
	public static int cntglas(String s) {
		String glas = "aeuioAEUIO";
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < glas.length(); j++) {
				if (s.charAt(i) == glas.charAt(j)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}