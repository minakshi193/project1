package javaTernaryOperators;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		int num;
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter the number");
		 num = scanner.nextInt();
		 
		 scanner.close();
		 
		 if(num>0)
		 {
			 System.out.println("positive");
			 
		 }
		 else if(num<0)
		 {
			 System.out.println("Negative");
			
		 }
		 else
		 {
			 System.out.println("Zero");
		 }

	}

}
