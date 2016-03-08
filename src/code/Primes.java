package code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primes {
	public static void main(String[] args){
		System.out.println("Enter the number of primes you want ");
		Scanner scan = new Scanner(System.in);
		int num=0;
		try{
		num = scan.nextInt();
		}
		catch(InputMismatchException exp)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int count,prime;
		int j=2;
		System.out.println("The first "+num+" primes are:");
		for(int i=1; i<=num; i++)
		{
			while(true)
			{
				count=0;
				prime=0;
				for(int k=1; k<=j; k++)
				{
					if(j%k==0)
						count++;
				}
				if (count==2)
				{
					System.out.println(j);
					prime++;
				}
				j++;
				if(prime==1)
					break;
				
			}
			
		}
	}

}
