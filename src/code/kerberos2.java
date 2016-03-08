package code;
public class kerberos2 {
	public void server(String usrnm)
	{
		String username = usrnm;
		String arr1[] = new String[3];
		arr1[0] = "earth";
		arr1[1] = "storm";
		arr1[2] = "ember";
		int arr2[]=new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		int pass=0,status=0;
		for(int i=0; i<3; i++)
		{
		if(username.equals(arr1[i]))
		{
			System.out.println(username+ " was found in the database");
			System.out.println("The key for this user is "+arr2[i]);
			pass=arr2[i];
			status=1;
		}}
		if(status==0)
		{
			System.out.println("Username not found in database");
			System.exit(0);
		}
	
		int session;double temp;
		temp = Math.random();
		temp=temp*10;
		session= (int)temp;
		System.out.println("Assigned session id is "+session);
		int var,j;
		String ticket = "access";
		System.out.println("The ticket for this username is "+"'"+ticket+"'");
		int len = ticket.length();
		char tic[] = new char[len];
		System.out.println("The packet to be sent to the client is "+ticket+session);
		System.out.println("Using caesar ecnryption... ");
		for(j=0;j<len;j++)
		{
			tic[j]=ticket.charAt(j);
			var = (int)tic[j]+pass;
			tic[j]=(char)var;
		}
		System.out.print("The encrypted packet passed to client is ");
		session=session+pass;
		String session_str=Integer.toString(session);
		String char_array = new String(tic);
		String encr = char_array+session_str;
		System.out.println(encr);
		System.out.println("Passing control back to client...");
		System.out.println("");
		kerberos1 obj= new kerberos1();
		obj.client(pass,encr,session);
}}