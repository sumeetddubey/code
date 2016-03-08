package code;
import java.io.*;
import java.util.*;
public class kerberos1 {
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username");
		String usr = scan.nextLine();
		System.out.println("Passing control to server...");
		System.out.println("");
		kerberos2 obj = new kerberos2();
		obj.server(usr);
		String arr1[] = new String[3];
		arr1[0] = "earth";
		arr1[1] = "storm";
		arr1[2] = "ember";
		int arr2[]=new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
	}
	public void client(int pass,String enc, int session)
	{
		System.out.println("Packet recieved from server as "+enc);
		String encr = enc;
		int len = encr.length(); int var;
		char arr_dec[] = new char[len-1];
		for(int i=0;i<len-1;i++)
		{
			arr_dec[i] = encr.charAt(i);
			var = (int)arr_dec[i]-pass;
			arr_dec[i] = (char)var;
		}
		String str_dec = new String(arr_dec);
		int session_id;
		session_id = session-pass;
		String tic_str = Integer.toString(session_id);
		String decr = str_dec+tic_str;
		System.out.println("The decrypted packet is "+decr);
	}

}