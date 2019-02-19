package ds.searching;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class BinarySearch {

	public static <V> void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int searchItem = 9;
		
		int begin = 0;
		int end = arr.length-1;
		int mid = (begin + end) /2;
		
		
		while (mid >= 0 ) {
			if (arr[mid] == searchItem) {
				System.out.println("Item found at index = " + mid);
				break;
			} else if (arr[mid] < searchItem) {
				begin = mid + 1;
			} else {
				end = mid-1;
			}
			mid = (begin + end) /2;
		}
		

	}

}
