package midTerm;

import java.util.Scanner;

public class ReversedWord {
	
	private String word1;
	private String word2;
	private String sentence;
	
	public void displayReversed() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first word");
		word1 = sc.next();
		System.out.println("Input the second word");
		word2 = sc.next();
		
		String reversed = "";
		
		for (int i = word2.length()-1; i >= 0 ; i--) {
				reversed += word2.charAt(i);
		}
		
		System.out.println(reversed + " " +  word1);
		sc.close();
	}
	public void displayReversedBySpace() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your words");
		sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		String reversed = "";
		for (int i = words[1].length()-1; i >= 0 ; i--) {
				reversed += words[1].charAt(i);
		}
		
		System.out.println(reversed + " " +  words[0]);
		sc.close();
	}
}
