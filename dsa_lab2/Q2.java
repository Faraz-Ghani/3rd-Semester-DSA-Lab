package dsa_lab2;

class Employee{
	int Salary;
	String Name,lastName;
	public int getSalary() {
		return Salary;
	}
	public String getName() {
		return Name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setSalary(int salary) {
		if(salary<0) {
			salary=0;
		}
		else {
		Salary = salary;
		}
		}
	public void setName(String name) {
		Name = name;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(String name, String lastname, int salary) {
		this.Name=name;
		this.lastName=lastname;
		if(salary<0) {
			salary=0;
		}
		else {
		Salary = salary;
		}
		
	}
	
}

public class Q2 {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Faraz","Ghani",2000);
		Employee e2 = new Employee("Aashish","Kumar",3320);
		int e1Yearly=e1.getSalary()*12;
		int e2Yearly=e2.getSalary()*12;
		
	System.out.println("The monthly salary of "+e1.getName()+" is " + e1Yearly);
	System.out.println("The monthly salary of "+e2.getName()+" is " + e2Yearly);
	
	e1Yearly+= e1Yearly/10;
	e2Yearly+= e2Yearly/10;
	System.out.println("After increase now");
	System.out.println("The monthly salary of "+e1.getName()+" is " + e1Yearly);
	System.out.println("The monthly salary of "+e2.getName()+" is " + e2Yearly);
	
	}

}
