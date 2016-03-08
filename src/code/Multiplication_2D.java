package code;

import java.util.Scanner;

public class Multiplication_2D {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i,j;
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		int arr3[][] = new int[3][3]; 
		System.out.println("Enter 1st array row-wise: ");
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter 2nd array row-wise: ");
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr2[i][j]=scan.nextInt();
			}
		}
		arr3[0][0]=(arr1[0][0]*arr2[0][0]) + (arr1[0][1]*arr2[1][0]);
		arr3[0][1]=(arr1[0][0]*arr2[0][1]) + (arr1[0][1]*arr2[1][1]);
		arr3[1][0]=(arr1[1][0]*arr2[0][0]) + (arr1[1][1]*arr2[1][0]);
		arr3[1][1]=(arr1[1][0]*arr2[0][1]) + (arr1[1][1]*arr2[1][1]);
		System.out.println("Multiplied array is ");
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
