package misc;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Oil {
	static int smallest;
	static boolean isFirstTime = true;


    /*
     * Complete the oilWell function below.
     */
    static int oilWell(int[][] blocks) {
        List<String> list = new ArrayList<String>();
        
        for (int i=0; i< blocks.length; i++) {
            for (int j=0; j< blocks[0].length; j++) {
                if (blocks[i][j] == 1) {
                    list.add(i+"-"+j);
                }
            }
        }
        String[] arr = new String[list.size()];
        arr = list.toArray(arr);
        
        permutation(arr, 0);                
        return smallest; // So as to not modify existing template, I am returning it
    }
    
    static void permutation(String arr[], int k) {
    	if (k == arr.length) {
    		long sum = 0;
    		for (int i=0; i< arr.length; i++) {
    			if (i > 1) {
    				String []temp1 = arr[i].split("-");
    				String []temp2 = arr[i-1].split("-");
    				/*long subX = Math.abs(Math.abs(Integer.parseInt(temp1[0]) - Integer.parseInt(temp2[0])));
    				long subY = Math.abs(Math.abs(Integer.parseInt(temp1[1]) - Integer.parseInt(temp2[1])));*/
    				long subX = Math.abs(Integer.parseInt(temp1[0]) - Integer.parseInt(temp2[0]));
    				long subY = Math.abs(Integer.parseInt(temp1[1]) - Integer.parseInt(temp2[1]));
    				sum = sum + (subX > subY ? subX : subY);
    			}
    		}
    		/*if (isFirstTime) {
    			smallest = (int)sum;
    			isFirstTime = false;
    		} else if (sum < smallest) {
    			smallest = (int)sum;
    		}*/
    		if (sum > 31) {
    			String abc = "";
    			abc = "";
    		}
    	} else {
    		for (int i=k; i<arr.length; i++) {
    			String temp = arr[i];
    			arr[i] = arr[k];
    			arr[k] = temp;
    			permutation(arr,k+1);
    			temp = arr[i];
    			arr[i] = arr[k];
    			arr[k] = temp;
    			
    		}
    	}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String[] rc = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = Integer.parseInt(rc[0]);

        int c = Integer.parseInt(rc[1]);

        int[][] blocks = new int[r][c];

        for (int blocksRowItr = 0; blocksRowItr < r; blocksRowItr++) {
            String[] blocksRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            for (int blocksColumnItr = 0; blocksColumnItr < c; blocksColumnItr++) {
                int blocksItem = Integer.parseInt(blocksRowItems[blocksColumnItr]);
                blocks[blocksRowItr][blocksColumnItr] = blocksItem;
            }
        }
        int result = oilWell(blocks);
        System.out.println(result);
        scanner.close();
    }
}
