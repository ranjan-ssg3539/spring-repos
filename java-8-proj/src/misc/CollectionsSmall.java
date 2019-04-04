package misc;

import java.util.ArrayList;
import java.util.List;

public class CollectionsSmall {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(2);
		System.out.println(l.get(2));// IndexOutOfBoundsException

	}

}
