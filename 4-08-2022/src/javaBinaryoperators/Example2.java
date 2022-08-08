package javaBinaryoperators;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		int sub1,sub2,sub3,sub4,sub5,sub6;
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter the six subject marks");
	

	sub1 = scanner.nextInt();
	sub2 = scanner.nextInt();
	sub3 = scanner.nextInt();
	sub4 = scanner.nextInt();
	sub5 = scanner.nextInt();
	sub6 = scanner.nextInt();
	
	scanner.close();
	
	if(sub1>=40 && sub2>=40 && sub3>=40 && sub4>=40 && sub5>=40 && sub6>=40)
	{
		System.out.println("semister is cleared");
		
	}
	else
	{
		System.out.println("semister is not cleared");
	}

	}

}
