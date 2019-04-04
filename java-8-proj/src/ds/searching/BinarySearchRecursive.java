package ds.searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int searchItem = 6;
		System.out.println(BinarySearch(0, arr.length - 1, arr, searchItem));
		
	}
	
	public static int BinarySearch(int begin, int end, int arr[], int searchItem) {
		int mid = (begin + end) / 2;
		if (mid < 0) {
			return -1;
		}
		if (arr[mid] == searchItem) {
			return mid;
		} else if (arr[mid] < searchItem) {
			return BinarySearch(mid + 1, end, arr, searchItem);
		} else {
			return BinarySearch(begin, mid - 1, arr, searchItem);
		}
	}

}
