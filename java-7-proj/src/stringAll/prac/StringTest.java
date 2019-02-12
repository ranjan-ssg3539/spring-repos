package stringAll.prac;

public class StringTest {

	public static void main(String[] args) {
		
		// String reverse Using character array
		String str = "abcde";
    	char [] strA = str.toCharArray();
    	for (int i = 0; i < strA.length /2; i++) {
    		char temp = strA[i];
    		strA[i] = strA[strA.length - 1 - i];
    		strA[strA.length - 1 - i] = temp;
    	}    	
    	System.out.println(String.valueOf(strA));
    	System.out.println(strA.toString()); // prints hashCode of the String
    	
    	// String reverse without using character array
    	//Wrong -V
    	/*for (int i=0; i< str.length()/2; i++) {
    		//StringBuilder temp = new StringBuilder(str.substring(i,i+1));
    		String s1 = str.substring(i,i+1);
    		String s2 = str.substring(str.length()-i-1,str.length()-i);
    		str = str.repl
    	}
    	System.out.println(str);*/
    	
	}

}
