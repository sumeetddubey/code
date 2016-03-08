package code;

public class error {
	private int a=10;
	error()
	{
		a=19;
	}
	public static void main(String[] args)
	{
		error obj =new error();
		System.out.println(obj.a);
	}
}