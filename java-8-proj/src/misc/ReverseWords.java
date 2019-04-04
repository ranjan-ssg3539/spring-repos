package misc;

// Reverse the order of words of a string
//  input: This is my dog
// output: dog my is This
public class ReverseWords {

	public static void main(String[] args) {
		char [] sentence = "Ranjan is my name".toCharArray();
		for (int i=0;i<sentence.length / 2; i++) {
			char temp = sentence[i];
			sentence[i] = sentence[sentence.length-1-i];
			sentence[sentence.length-1-i] = temp;
		}
		String str = String.valueOf(sentence);
		//eman ym si najnaR
		int begin = 0;
		int end = 0;
		
		while (end != str.length()){
			end = str.indexOf(" ", begin);
			if (end == -1) {
				end = str.length();
			}
			String temp = reverse(str.substring(begin, end));
			str = str.replace(str.substring(begin, end), temp);
			begin = end + 1;
		}
		
		System.out.println(str);
	}
	
	public static String reverse(String s) {
		char []str = s.toCharArray();
		for (int i=0; i<str.length / 2; i++) {
			char temp = str[i];
			str[i] = str[str.length - 1 - i];
			str[str.length - i - 1] = temp;
		}
		return String.valueOf(str);
	}

}
