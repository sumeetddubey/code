package code;

public class Function_3t {
	public void storage(String data)
	{
		String arr1[] = new String[3];
		int arr2[] = new int[3];
		int result=10,pass=0;
		arr1[0]="sumeet";
		arr1[1]="bhoamik";
		arr1[2]="reddy";
		arr2[0]=156;
		arr2[1]=250;
		arr2[2]=654;
		System.out.println("At database. Checking name...");
		for(int i=0;i<3;i++)
		{
			if(data.equals(arr1[i])==true)
			{
				result=i;
				pass = arr2[i];
			}
		}
		Server_3t.display(result,pass);
	}

}
