package prac.misc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class RKException extends Exception {
	public RKException() {
		super("RKException msg");
	}
}

public class CombinationsOfChars {

	public static void main(String[] args) {
		
		try {
			throw new RKException();
		} catch (RKException e) {
			System.out.println(e.getMessage());
		}
		
		/*System.out.println("How many numbers ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter numebrs:");
		int [] arr = new int[n];
		for (int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Before combinations:");
		for (int i=0;i <n; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println("\nAfter combinations:");
		permute(arr,0);*/
	}
	
	public static void permute(int arr[], int k) {
		if (k == arr.length) {
			for (int i=0; i<arr.length; i++) {
				System.out.print(" " + arr[i]);
			}
			System.out.println();
		} else {
			for (int i=k; i<arr.length; i++) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				permute(arr, k+1);
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}

}
