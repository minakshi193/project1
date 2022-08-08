package javaTernaryOperators;
import java.util.Scanner;

/**
 * 
 * Ternary Operator(?:)
 * 
 * These  operators will generate output in the form.
 * of boolean(true or false)
 * 
 *
 */

public class Example1 {

	public static void main(String[] args) 
	
	{
		int personAge;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter person age");
		personAge = scanner.nextInt();
		
		scanner.close();
		
		boolean condition = (personAge >= 21);
		
		String ableToMarry = "person is able to get marry.";
		
		String notAbleToMarry = "person is not able to get married.";
		
		//short hand if-else
		
		System.out.println(condition  ?  ableToMarry : notAbleToMarry);
	}
	
		

}
