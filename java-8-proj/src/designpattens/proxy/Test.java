package designpattens.proxy;

import java.io.FileNotFoundException;

class Parent {
	void m1() throws Exception {
		
	}
}

class Child extends Parent {
	void m1() throws FileNotFoundException {
		
	}
}

public class Test {

	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println(arr[0]);

	}

}
