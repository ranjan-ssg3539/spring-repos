package com.rk;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Student {
	int id;
	String name;
	int rank;
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override 
	public boolean equals(Object o) {
		Student s = (Student) o;
		return s.id == this.id;
	}
}

public class MainApp {

	public static void main(String[] args) {
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld  helloWorldObj = (HelloWorld) ac.getBean("helloWorld");
		helloWorldObj.getMessage();*/
		
		// Anagram of two strings in single loop
		// Max of sum of contiguous elements of a given array 
		//String s1 = "abc";
		//String s2 = "bca";
		
		
	}

}
