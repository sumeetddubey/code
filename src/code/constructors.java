package code;

public class constructors {
	String n,s1,s2;
	constructors()
	{
		System.out.println("You only live once!!");
	}
	
	constructors(String str)
	{
		n=str;
		System.out.println("You only live once "+n);
	}
	
	constructors(String s1, String s2)
	{
		//this();
		this.s1=s1;
		this.s2=s2;
		System.out.println(s1+" "+s2);
		
	}
	public static void main(String[] args)
	{
		constructors temp=new constructors();
		constructors temp2=new constructors("LOL");
		constructors temp3=new constructors("I am Alive","I lived Twice");
	}

}
