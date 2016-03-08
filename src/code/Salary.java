package code;

public class Salary extends Employee{
	
	int salary;
	
	public Salary(int id, String name, String email, int salary){
		super(id, name, email);
		setSalary(salary);
	}
	
	public void setEmail(String newemail){
		System.out.println("Setting email by overriding super class method "+this.name );
		email = newemail; 
	}
	private void setSalary(int newsalary) {
		System.out.println("Setting salary from subclass for "+this.name);
		salary = newsalary;
	}
	
	public static void main(String[] args){
		Employee e1 = new Employee(1, "sumeet", "summet@xyz.com");
		Employee e2 = new Salary(2, "aman", "aman@xyz.com", 10000);
		Salary s1 = new Salary(3,"rohit", "rohit@xyz.com", 20000);
		
		e1.setEmail("sumeet@ab.com");
		e2.setEmail("aman@abc.com");
		s1.setEmail("rohit@abc.com");
		s1.getEmail();
	}
}

