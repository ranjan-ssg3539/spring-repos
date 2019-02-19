package prac.collection;

public class StringPalinndromeSubString {

	public static void main(String[] args) {
		
		
		String str = "aaaa";
		//a a a a  aa aa aa aaa aaa aaaa
		//System.out.println(isPalindrome(str));
		int count = 0;
		for (int i=0; i< str.length(); i++) {
			for (int j=i+1; j<= str.length(); j++) {
				if (isPalindrome(str.substring(i, j))) {
					count ++;
				}
			}
		}
		System.out.println(count);

	}
	
	static boolean isPalindrome(String str) {
		boolean isP = true;
		for (int i=0; i<str.length() /2; i++) {
			if (! (str.substring(i, i+1)).equals(str.substring(str.length()-i-1, str.length()-i))) {
				isP = false;
			}
		}
		return isP;
	}

}
