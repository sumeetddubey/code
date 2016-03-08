package code;
import java.io.*;

public class InsertionSort {
	public static void main(String[] args) throws IOException{
		int[] arr1 = {422,141,44646,12,1};
		isort(arr1);
	}

	private static void isort(int[] arr1) {
		for (int i=1; i< arr1.length; i++){
			for(int j=i; j>0; j--){
			if (arr1[j]<arr1[j-1]){
				int temp;
				temp = arr1[j];
				arr1[j] = arr1[j-1];
				arr1[j-1] = temp;
			}}
		}
		for(int k=0; k<arr1.length; k++){
			System.out.println(arr1[k]);
		}
		
	}

}
