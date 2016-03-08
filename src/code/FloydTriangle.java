package code;
import java.io.*;

public class FloydTriangle {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Enter the number of desired rows ");
		int n = Integer.parseInt(br.readLine());
		int temp=1;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println(" ");
		}
		
		
	}

}
