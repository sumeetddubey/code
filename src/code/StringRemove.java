package code;

import java.util.Scanner;

public class StringRemove {
	public static void main(String[] args)
	{
		System.out.println("Enter a string ");
		Scanner scan = new Scanner(System.in);
		String str = "";
		str = scan.nextLine();
		int len = str.length();
		str = str.replaceAll("a", "");
		System.out.println("The string excluding a is: "+str);
		char[] arr1 = str.toCharArray();
		for(char c:arr1)
		{
			System.out.print(c);
		}
}
}
