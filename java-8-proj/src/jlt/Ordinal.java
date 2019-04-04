package jlt;

/*
 * Exercise 7: Kermit, a frog hops in a particular way such that:

1. He hops 20cm in the first hop, 10cm in the second hop and 5cm in the third hop.
2. After three hops Kermit rests for a while and then again follows the same hopping pattern.

Calculate the total distance traveled by Kermit (in centimeters) for the provided number of hops. Exactly 4 numbers of hops will be provided to the program (one number per line) as per the below example.

Suppose the following number of hops is provided to the program:
4
6
3
5

Then the total distance covered should be displayed as follows:
55
70
35
65*/

import java.util.Scanner;

public class Ordinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int input = Integer.parseInt(in);
		int distance = 0;		
		for (int i=1; i<=input; i++) {
			if (i % 3 == 1) {
				distance = distance + 20;
			} else if (i % 3 == 2) {
				distance = distance + 10;
			} else if (i % 3 == 0) {
				distance = distance + 5;
			}
		}	
		System.out.println("Distance covered = " + distance);
	}
}
