package code;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your 1st number ");
		int num1 = scan.nextInt();
		System.out.println("Enter your 2nd number ");
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("The addition is "+num3);
	}

}
