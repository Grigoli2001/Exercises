package midTerm;

import java.util.Scanner;

public class GradeCheck {
	
	private String subject;
	private String grade;
	public void displayComment() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Subject");
		subject = sc.next().toLowerCase();
		System.out.println("Enter the grade");
		grade = sc.next().toLowerCase();
		sc.close();
		switch(grade) {
		case "a":
			System.out.println("Excelent");
			break;
		case "b":
			System.out.println("Good! You can still improve");
			break;
		case "c":
			System.out.println("Try harder");
			break;
		case "d":
			System.out.println("Not very good");
			break;
		case "F":
			System.out.println("Absolutely Horrible You failed");
			break;
		default:
			System.out.println("Incorrect input");
		}	
		
	}
	
}
