package practice;

import java.util.ArrayList;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void DisplayDetails() {

		Employee emp1 = new Employee(1, "Shristi", 50000);
		Employee emp2 = new Employee(2, "Ram", 60000);
		Employee emp3 = new Employee(3, "Vinod", 70000);

		ArrayList<Employee> alist = new ArrayList<Employee>();
		alist.add(emp1);
		alist.add(emp2);
		alist.add(emp3);

		System.out.println(alist);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayDetails();

	}

}
