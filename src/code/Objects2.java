package code;

import java.io.*;

public class Objects2 {
	public static void main(String[] args)
	{
		Objects1 emp1 = new Objects1("Sumeet Dubey");
		Objects1 emp2 = new Objects1("Sharath Reddy");
		emp1.fnAge(20);
		emp1.fnGender("Male");
		emp1.fnSalary(40000);
		emp1.printEmp();
		
		emp2.fnAge(21);
		emp2.fnGender("Male");
		emp2.fnSalary(40000);
		emp2.printEmp();
	}

}
