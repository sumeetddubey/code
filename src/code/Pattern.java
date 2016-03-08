package code;
import java.io.*;
import java.util.Scanner;
public class Pattern {
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		if(temp%2.==0)
		{
			System.out.println("Number of rows has to be odd");
			System.exit(0);
		}
		int n=temp/2+1;
		int i=0,j=0,k=0;
		for(i=1; i<=n; i++)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=2*n-3;k>=2*i-1;k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
