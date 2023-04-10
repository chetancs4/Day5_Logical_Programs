package com.logical;

import java.util.Scanner;

public class Q4_Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not: ");
		int num = sc.nextInt();
		int reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    // run loop until num becomes 0
		    while(num != 0) {
		    
		      // get last digit from num
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
	}

}
