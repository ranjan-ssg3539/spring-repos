package misc;

// Replace each occurrence of letter b with xyz in a String or in a character array
// Condition: use only one array

public class StringReplaceLetter {
	public static void main(String[] args) {
		char []arr = new char[100];
		arr[0] = 'a';
		arr[1] = 'a';
		arr[2] = 'b';
		arr[3] = 'b';
		arr[4] = 'c';
		
		int bcount = 2;
		int totalCount = 5;
		
		int last = totalCount + bcount*2 - 1;
		
		for (int i=totalCount - 1; i>=0; i--) {
			if (arr[i] == 'b') {
				arr[last--] = 'z';
				arr[last--] = 'y';
				arr[last--] = 'x';
			} else {
				arr[last--] = arr[i];
			}
		}
		
		System.out.println(arr.length);

	}
}
