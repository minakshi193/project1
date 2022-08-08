package javaTernaryOperators;

import java.util.Scanner;

public class Exampletask5largeno {

	public static void main(String[] args) {
				
				int num1,num2,num3,num4,temp1,temp2,result;
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter first value");
				num1 = scanner.nextInt();
				
				System.out.println("Enter second value");
				num2 = scanner.nextInt();
				
				System.out.println("Enter third value");
				num3 = scanner.nextInt();
				
			System.out.println("Enter fourth value");
			num4 = scanner.nextInt();
				
				scanner.close();
				
				System.out.println("====================================");
				
				temp1 = (num1 > num2)? num1:num2;
				temp2 = (num3>num4)? num3:num4;
				
				result=(temp1>temp2)? temp1:temp2;				
				
			
				
				System.out.println("large number " +result);



				
			}

		

}
