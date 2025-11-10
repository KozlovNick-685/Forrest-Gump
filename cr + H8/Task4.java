import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String sogl = "bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ";
		String glas = "aeiouyAEIOUY";
		boolean flag = true;
		for(int i = 0; i < str.length() - 1; i++) {
			char pastSimb = str.charAt(i);
			char nextSimb = str.charAt(i + 1);

			boolean glasChetko = false;
			for(int j = 0; j < glas.length(); j++) {
				if (pastSimb == glas.charAt(j)) {
					glasChetko = true;
					break;
				}
			}
			if (glasChetko) {
				boolean soglChetko = false;
				for(int k = 0; k < sogl.length(); k++) {
				if (nextSimb == sogl.charAt(k)) {
					soglChetko = true;
					break;
					}
				}
				if (!soglChetko) {
					flag = false;
					break;
				}
			}
		}
		System.out.println(flag);
	}
}