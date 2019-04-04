package Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu> {
	int id;
	String name;
	public Stu(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Stu stu) {
		if (this.id > stu.id) {
			return 1;
		} else if (this.id < stu.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class NoOverride {

	public static void main(String[] args) {
		List<Stu> list = new ArrayList<Stu>();
		list.add(new Stu(4, "d"));
		list.add(new Stu(1, "a"));
		list.add(new Stu(3, "c"));
		list.add(new Stu(2, "b"));
		
		Collections.sort(list);
		for (Stu stu : list) {
			System.out.println(stu.id + " = " + stu.name );
		}

	}

}
