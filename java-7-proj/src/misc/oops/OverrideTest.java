package misc.oops;

class P1 {
	static void m1() { 
		System.out.println("p1");
		
	}	
}

class C1 extends P1 {
	static int val;
	//@Override
	static void m1() { 
		System.out.println("c1");
	}	
	
	static void m2(int i) {
		val = i;
		System.out.println("i = " + val);
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {
		P1 p1 = new P1();
		p1.m1();
		
		C1.m2(1);
		C1.m2(2);
	}

}
