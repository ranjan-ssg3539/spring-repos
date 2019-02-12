package prac.misc;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static void permute(int arr[], int k) {
		if (arr.length == k) {
			for (int i = 0; i<arr.length; i++) {
				System.out.print(arr[i]);
			} 
			System.out.println();
		}
		else {
			for (int i=k; i< arr.length;i++) {
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

	
    public static void main(String[] args) throws IOException {
        /*int [][] arr = new int [3][4];
        
        arr[0][0]=1;   arr[0][1]=2;   arr[0][2]=3; arr[0][3]=4;
        arr[1][0]=5;   arr[1][1]=6;   arr[1][2]=7; arr[1][3]=8;
        arr[2][0]=9;   arr[2][1]=10;   arr[2][2]=11; arr[2][3]=12; 
        
        set(1  5  9)
        
        1-5-9
        1-9-5
        5-1-9
        5-9-1
        9-1-5
        9-5-1
        
        set(1  3  5  9)
        1-3-5-9
        1-3-9-5
        1-5-3-9
        1-5-9-3
        1-9-3-5
        1-9-5-3*/
        
    	
    	System.out.println("How many numbers ?");
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter numbers:");
        for (int i =0; i< n;i++) {
        	arr[i] = sc.nextInt();
        }
        System.out.println("Original sequence is:");
        for (int i =0; i< n;i++) {
        	System.out.print("\t" + arr[i]);
        } 
        
        System.out.println("Permutation sequence is:");
        permute(arr,0);
        
        //
        
        //Collections.synchronizedList(list);
    }
}
