package RegularExpression;

import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// * -> 0 or more
		// + -> 1 or more
		// ? -> 0 or 1
		//if ("12-12-1985".matches())
		Pattern p = Pattern.compile(".s"); // single character
		if ("00-00-0000".matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		/*String s2 = "abc";
		
		String s1 = new String("abc");
		System.out.println(s1.equals(s2));*/

	}

}
