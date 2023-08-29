package SortingCollections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
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
	public int compareTo(Employee o) {
		if(this.id==o.id)
	    return 0;
		else if(this.id>o.id)
		return 1;
		else
		return -1;		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
	
	
}
public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"Vinayak",50000.0));
		employees.add(new Employee(2,"Rishabh",20000.0));
		employees.add(new Employee(3,"Saurabh",2000.0));
		employees.add(new Employee(4,"Akshay",200.0));
		Collections.sort(employees);
		System.out.println(employees);
		
	}

}
