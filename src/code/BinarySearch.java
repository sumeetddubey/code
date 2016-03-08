package code;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args){
		System.out.println("Enter the number of elements ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Enter the elements ");
		int array[] = new int[num];
		for(int i=0; i<num; i++)
		{
			array[i] = scan.nextInt();
		}
		int temp;
		for(int j=0; j<num; j++)
		{
			for(int k=0; k<num-1 ; k++)
			{
				if(array[k]>array[k+1])
				{
					temp=array[k];
					array[k]=array[k+1];
					array[k+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is ");
		for(int i= 0; i<num; i++)
		{
			System.out.print(" "+array[i]);
		}
		System.out.println("");
		System.out.println("Now enter the element to be searched ");
		int num2 = scan.nextInt();
		int first, middle, last;
		first=0;
		last = num-1;
		middle= (first+last)/2;
		while(first<=last)
		{
		if(num2<array[middle])
		{
			last=middle-1;
			middle = (first+last)/2;
		}
		else if(num2>array[middle])
		{
			first=middle+1;
			middle=(first+last)/2;
		}
		else if(num2==array[middle])
		{
			System.out.println("The element found at position number: "+(middle+1));
			break;
		}
		}
		if(first>last)
		{
			System.out.println("The element was not found ");
		}
	}

}
