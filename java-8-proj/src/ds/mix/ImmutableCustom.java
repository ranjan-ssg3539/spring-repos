package ds.mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Immu {
	private final int a;
	private final List<String> list;
	Immu(int a, List<String>list) {
		this.a = a;
		this.list = list;
	}
	public int getA() {
		return a;
	}
	public List<String> getList() {
		return Collections.unmodifiableList(list);
	}
}

public class ImmutableCustom {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>(); l1.add("a"); l1.add("b");
		Immu i1 = new Immu(0, l1);
		i1.getList().add("c");
		i1.getList();

	}

}
