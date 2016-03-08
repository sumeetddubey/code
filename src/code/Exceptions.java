package code;

import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args){
		System.out.println("Enter two integers");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3;
		try{
		num3 = num1/num2;
		System.out.println("The division is "+num3);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
	}

}
