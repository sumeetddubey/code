package code;

public class methods {
	public static void main(String[] args)
	{
		staticmethod();
		methods temp = new methods();
		temp.nonstaticmethod();
		palindrome temp2 = new palindrome();
		temp2.hello();
	}
	static void staticmethod()
	{
		System.out.println("Called without creating an object");
	}
	
	void nonstaticmethod()
	{
		System.out.println("Called after creating an object");
	}
	
}

