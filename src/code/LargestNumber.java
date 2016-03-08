package code;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args){
		System.out.println("Enter the size of your array");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int array[] = new int[size];
		System.out.println("Enter "+size+" numbers");
		for(int i=0; i<size; i++){
			array[i] = scan.nextInt();
		}
		int temp;
		for(int j=0;j<size;j++)
		{
			for(int k=0;k<j;k++)
			{
			if(array[j]>array[k])
			{
				temp = array[j];
				array[j] = array[k];
				array [k] = temp;
			}
			}
		}
		System.out.println("The largest element is "+array[0]);
		
		
	}

}
