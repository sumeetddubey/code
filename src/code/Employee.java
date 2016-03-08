package code;

public class Employee {
	//instance variables
	int id;
	String name;
	String email;
	
	//constructor
	public Employee(int id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	//methods
	public String getName(){
		System.out.println(name);
		return name;
	}
	
	public String getEmail(){
		System.out.println(email);
		return email;
	}
	
	public void setName(String newname){
		System.out.println("setting name from super class for " +this.name);
		name = newname;
	}
	
	public void setEmail(String newemail){
		System.out.println("setting email from super class for " +this.name);
		email = newemail;
	}
	
}
