package com.DSA.java;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		
		int a,b,c,max;
		
		Scanner in = new Scanner(System.in);
		 
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		max =a;
		
		if (b>max) {
			
			max = b;
		}
			if (c>max) {
			
			max = c;
		}

			System.out.println("Largest number:"+max);
	}

}
