package javaTernaryOperators;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		int num1,num2,num3,temp,result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value");
		num1 = scanner.nextInt();
		
		System.out.println("Enter second value");
		num2 = scanner.nextInt();
		
		System.out.println("Enter third value");
		num3 = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("====================================");
		
		temp = (num1 > num2)? num1:num2;
		
		result = (temp > num3)? temp: num3;
		
		System.out.println("large number " +result);
		
		


		
	}

}
