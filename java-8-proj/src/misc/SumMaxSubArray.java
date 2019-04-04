package misc;

public class SumMaxSubArray {

	public static void main(String[] args) {
		int [] a = {-4,-3,-2,4,6,-3,2,0,-2,5,-5,2};
		
		/*int firstIndex = 0;
		int lastIndex = 0;
		int sumPrev = 0;
		int sumCurr = 0;
		
		for (int i=0; i< arr.length; i++) {
			sumCurr = sumCurr + arr[i];
			if (sumCurr > sumPrev) {
				sumPrev = sumCurr;
			} else {
				sumCurr = sumPrev;
			}
		}
		
		System.out.println(sumCurr);
		System.out.println(sumPrev);*/
		
		int max = a[0];
		int maxCurr = a[0];
		for (int i = 1; i< a.length; i++) {
			maxCurr = maxCurr + a[i];
			if (maxCurr > max) {
				max = maxCurr;
			}
			if (maxCurr < 0) {
				maxCurr = 0;
			}
		}
		System.out.println(max);
		System.out.println(maxCurr);
		
	}

}
