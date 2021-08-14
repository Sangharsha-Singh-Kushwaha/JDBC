package JDBC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	public int salary;
	public String name;
	public String address;
	public static int count = 0;

	public Employee() {
	}

	public Employee(String name, String address, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;

		count++;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}
}

class SalaryComparator implements Comparator {
	public int compare(Object emp1, Object emp2) {
		int sal1 = ((Employee) emp1).getSalary();
		int sal2 = ((Employee) emp2).getSalary();
		String name1=((Employee) emp1).getName();
		String name2=((Employee) emp2).getName();

		if (sal1 > sal2)
			return 1;
		else if (sal1 < sal2)
			return -1;
		else
			return 0;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Noor", "Delhi", 100000000));
		list.add(new Employee("shoaib", "Mumbai", 20000));
		list.add(new Employee("DheruBhai", "Chennai", 15000));
		list.add(new Employee("Nasedi", "Kolkata", 100));
		System.out.println(" ");
		int count = 0;
		int salary = 0;
		String nameString=null;
		Collections.sort(list, new SalaryComparator());
		for (Employee data : list) {
			salary = data.getSalary();
			nameString=data.getName();
		}
		System.out.println("Employee  "+nameString+" has highest salary which is: " + salary);

	}

}
