package SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class AgeComparator implements Comparator<Employees>
{

	@Override
	public int compare(Employees o1, Employees o2) {
		
		if(o1.getAge()>o2.getAge())
		return -1;
		else if(o1.getAge()<o2.getAge())
		return 1;
		else
		return 0;
	}
	
}

class SalaryComparator implements Comparator<Employees>
{

	@Override
	public int compare(Employees o1, Employees o2) {
		
		if(o1.getSalary()>o2.getSalary())
		return -1;
		else if(o1.getSalary()<o2.getSalary())
		return 1;
		else
		return 0;
	}
	
}

class Employees
{
	int id;
	String name;
	int salary;
	int age; 
	
	public Employees(int id, String name, int salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

    	
}

public class ComparatorInterface {

	public static void main(String[] args)
	{
		ArrayList<Employees> employees=new ArrayList<Employees>();
		employees.add(new Employees(1,"Vinayak",10000,20));
		employees.add(new Employees(2,"Rishabh",1000,24));
		employees.add(new Employees(3,"Saurabh",100,23));
		employees.add(new Employees(4,"Akshay",10,21));
		Collections.sort(employees,new AgeComparator());
		System.out.println("Sorting Descending by Age: "+employees);
		Collections.sort(employees,new SalaryComparator());
		System.out.println("Sorting Descending by salary: "+employees);
		
	}
}
