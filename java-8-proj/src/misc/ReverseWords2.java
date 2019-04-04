package misc;

public class ReverseWords2 {

	// This approach is without taking help of any other string
	
	public static void main(String[] args) {
		char [] sentence = "Ranjan is my name".toCharArray();
		// First reverse the entire string
		for (int i=0;i<sentence.length / 2; i++) {
			char temp = sentence[i];
			sentence[i] = sentence[sentence.length-1-i];
			sentence[sentence.length-1-i] = temp;
		}
		//eman ym si najnaR
		int begin = 0;
		int end = 0;
		
		while (true) {
			while (sentence[end] != ' ' && end<=sentence.length) {
				end ++;
			};
			
			char []temp = reverse(sentence, begin, end);
			if (end == sentence.length) {
				break;
			}			
		} 
		for (int i=0; i< sentence.length; i++) {
			begin = i;
			
		}
	}
	
	public static char[] reverse(char []str, int begin, int end) {
		char []temp = new char[end - begin];
		for (int i=begin; i<temp.length / 2; i++) {
			char t = str[i];
			str[i] = str[str.length - 1 - i];
			str[str.length - i - 1] = temp;
		}
		return str;
	}

}
