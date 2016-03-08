/*package yaaoo;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		System.out.println("Enter your string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len = s.length();
		char temp;
		int k=0;
		char array[] = new char[len];
		for(int i=len-1; i>-1; i--)
		{
			temp=s.charAt(i);
			array[k]=temp;
			k++;
		}
		System.out.println("The string reversed is ");
		for(int j=0;j<len;j++)
		{
			System.out.print(array[j]);
		}
	}

}*/


package code;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		System.out.println("Enter your string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len = s.length();
		char temp;
		String rev="";
		for(int i=len-1; i>-1; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The string reversed is "+rev);
		
	}

}