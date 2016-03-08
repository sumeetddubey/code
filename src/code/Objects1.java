package code;

import java.io.*;

public class Objects1 {
	int age, salary;
	String name, gender;
	
	public Objects1(String name)
	{
		this.name=name;
	}
	void fnAge(int age)
	{
		this.age = age;
	}
	void fnSalary(int salary)
	{
		this.salary = salary;
	}
	void fnGender(String gender)
	{
		this.gender=gender;
	}
	void printEmp()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(salary);
	}
}
