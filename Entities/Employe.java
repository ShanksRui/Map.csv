package Entities;

public class Employe {

	private String name;
	private String email;
	private Double salary;
	
	
	public Employe(String name,String email,Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	@Override
	public String toString() {
		return  email;
	}	
}
