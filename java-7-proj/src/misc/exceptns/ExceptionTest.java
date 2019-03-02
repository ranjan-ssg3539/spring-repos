package misc.exceptns;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.NavigableSet;
import java.util.TreeSet;

class Parent {
	public void m1() throws Exception {
		
	}
}

class Child extends Parent {
	public void m1() throws ArithmeticException {
		
	}
}

// If both under Runtime no order problem

public class ExceptionTest {

	public static void main(String[] args)  {
		NavigableSet<String> ns = new TreeSet<String>();
		ns.add("1"); ns.add("2"); ns.add("3"); ns.add("4"); ns.add("5");
		
		ns = ns.tailSet("3", true);
		ns.pollLast();
		
		String s1 = "39.46";
		String s2 = "100";
		
		Double d1 = Double.valueOf(s1);
		Double d2 = Double.valueOf(s2);
		double d3 = d1/d2;
		System.out.println(d3);
		
		Float f1 = Float.valueOf(s1); 
		Float f2 = Float.valueOf(s2); 
		float f3 = f1/f2;
		System.out.println(f3); 
		
		BigDecimal b1 = new BigDecimal(s1);
		BigDecimal b2 = new BigDecimal(s2);
		BigDecimal b3 = b1.divide(b2);
		System.out.println(b3);
		/*try {
			m();
		} catch (ArithmeticException e) {
			System.out.println("main catch");
		}*/
	}
	
	public static void m() throws ArithmeticException  {
		/*try {
			throw new ArithmeticException();
		} 
		finally {
			System.out.println("finally m()");
		}*/
		
	}
}
