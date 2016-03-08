package code;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		System.out.println("Enter a number ");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		int n=num;
		int rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(n==rev)
		System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
	}
	public void hello()
	{
		System.out.println("This is a method from another class");
	}

}
