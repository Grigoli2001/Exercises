package midTerm;

import java.util.Scanner;

public class MaxNumber {
	private int num1;
	private int num2;
	
	public void displayMax() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		num1 = sc.nextInt();
		System.out.println("");
		System.out.print("Enter the second integer: ");
		num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("The bigger integer is %d", num1>num2 ? num1 : num2);
		
		
		
	}
}
