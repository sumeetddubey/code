package code;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks ");
		int mks = scan.nextInt();
		if(mks<40)
			System.out.println("Sorry you have failed");
		else 
			System.out.println("Congratulations you have passed");
			
	}

}
