package code;

import java.io.IOException;
import java.util.Scanner;

public class Client_3t {
	public static void inputName()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.nextLine();
		Server_3t server1 = new Server_3t();
		server1.checkName(name);
	}
	public static void main(String[] args) throws IOException
	{
		inputName();
	}

}
