package midTerm;

import java.util.Scanner;

public class EvenList {
	private int num;
	
	public void displayEven() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		num = sc.nextInt();
		sc.close();
		
		for(int i = 2; i <num; i+=2) {
				System.out.print(i+" ");
		}
		
	}
}
