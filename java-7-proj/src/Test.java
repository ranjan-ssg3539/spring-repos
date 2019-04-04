import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hpsf.Array;

class Im {
	int i;
	List<String> list;
	public Im(int i, List<String> list) {
		this.i = i;
		this.list = list;
	}
	public int getI() {
		return i;
	}
	public List<String> getList() {
		return list;
	}
}

public class Test {

	public static void main(String[] args) {
		Map m;
		HashMap<Integer, String> hm;
		
		int i = 1;
		List<String> ll = new ArrayList<String>();  ll.add("aa"); ll.add("bb");
		Im im = new Im(i, ll);
		
	}

}
