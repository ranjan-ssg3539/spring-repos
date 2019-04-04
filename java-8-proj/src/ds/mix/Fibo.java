package ds.mix;

public class Fibo {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		int n = 6;
		int count = 2;
		System.out.print(" " + 0 + " " + 1);
		/*while (count < n) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
			count ++;
		}*/
		fibo(0, 1, 6);

	}
	
	static void fibo(int f1, int f2, int n) {
		if (n == 2) {
			return;
		}		 
		int f3 = f1 + f2;
		System.out.print(" " + f3);
		fibo(f2, f3, n-1);
	}

}
