package midTerm;

import java.util.Scanner;

public class PunctuationCheck {
	private String sentence;
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Sentence");
		sentence = sc.nextLine();
		int k = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ',' || sentence.charAt(i) == '.' || sentence.charAt(i) == ';' || sentence.charAt(i) == '?') {
				System.out.println();
			}else if(sentence.charAt(i) == ' ') {
				continue;
			}
			else {
				System.out.print(sentence.charAt(i));
			}
		}
	}
}
