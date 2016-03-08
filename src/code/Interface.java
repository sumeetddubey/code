package code;

public class Interface implements InterfaceExample {
	
	int z;
	@Override
	public void addition(int a, int b) {
		z = a+b;
		System.out.println(z);
	}

	@Override
	public void subtraction(int a, int b) {
		z=a-b;
		System.out.println(z);
	}
	
	public static void main(String[] args){
		Interface i = new Interface();
		i.addition(1,2);
		i.subtraction(11, 1);
	}


}
