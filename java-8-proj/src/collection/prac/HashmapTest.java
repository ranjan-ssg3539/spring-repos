package collection.prac;

import java.util.HashMap;
import java.util.Map;


class Emp {
	int id;
	String name;
	
	Emp(int id, String name) {
		this.id = id;
		this.name = name;			
	}
	
	@Override
	public int hashCode() {
		return id * 0;			
	}
	
	/*@Override
	public boolean equals(Object e) {
		return true;		
	}*/
}

public class HashmapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		//byte b = -129;
		//System.out.println(b);
		
		//int [][]arr = new int[2][2];
		System.out.println((float)5/3);
		System.out.println((double)5/3);
		System.out.println(new Float((float)5/3));
		System.out.println(new Double((double)5/3));
		
		
		int []arr = new int[4];
		System.out.println(arr.length);
		
		String s = "07:05:45PM";
		System.out.println(s.substring(8,10));
		
		Emp e1 = new Emp(1,"Rk1");
		Emp e2 = new Emp(2,"Rk2");
		Map<Emp, String> m1 = new HashMap<Emp, String>();
		m1.put(e1, e1.name);
		m1.put(e2, e2.name);
		System.out.println(m1.size());

	}
}
