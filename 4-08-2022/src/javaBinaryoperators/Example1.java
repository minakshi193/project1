package javaBinaryoperators;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		int num;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		num = scanner.nextInt();
		
	scanner.close();
	if(num%2 ==0)
	{
		System.out.println("Enter even no");
	}
	else
	{
		System.out.println("Enter odd no");
	}
		
		
		

	}

}
