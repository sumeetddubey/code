package code;

public class Server_3t {
	public void checkName(String nm)
	{
		String name;
		name = nm;
		System.out.println("Recieved name at server. Passing control to database");
		Function_3t store = new Function_3t();
		store.storage(name);
	}

	public static void display(int result, int pass) {
		System.out.println("Recieved output from database. Control at server...");
		if(result==1||result==2||result==0)
		{
			System.out.println("Result found and password is "+pass);
		}
		else
			System.out.println("User not found in database");
	}
	
}
