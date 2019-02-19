package Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student implements Comparable<Student> {
	int id;
	String name;
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
}

class Employee {
	int id;
	String name;
	public Employee (int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class EmpComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Employee s1 = (Employee) o1;
		Employee s2 = (Employee) o2;
		if (s1.id > s2.id) {
			return 1;
		} else if (s1.id < s2.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class TestCompare {

	public static void main(String[] args) {
		// Comparable
		Student s1 = new Student(4,  "ds");
		Student s2 = new Student(2, "bs");
		Student s3 = new Student(1, "as");
		Student s4 = new Student(3,  "cs");
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		for (Student s : list) {
			System.out.println(s.name);
		}
		System.out.println();
		
		// Comparator
		List<Employee> elist = new ArrayList<Employee>();
		Employee e1 = new Employee(4,  "de");
		Employee e2 = new Employee(2, "be");
		Employee e3 = new Employee(1, "ae");
		Employee e4 = new Employee(3,  "ce");
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		for (Employee e : elist) {
			System.out.println(e.name);
		}
		Collections.sort(elist, new EmpComparator());
		for (Employee e : elist) {
			System.out.println(e.name);
		}
		

	}

}
