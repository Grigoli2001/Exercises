package midTerm;

import java.util.Scanner;

public class ReverseCase {
	private String str;

	public void displayReverseCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		str = sc.next();

		String c = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				c += Character.toUpperCase(str.charAt(i));
			} else {

				c += Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(c);
		sc.close();

	}
}
