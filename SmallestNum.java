package com.DSA.java;

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		
		int a,b,c,min;
		
		Scanner in = new Scanner(System.in);
		 
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		min =a;
		
		if (b<min) {
			
			min = b;
		}
			if (c<min) {
			
				min = c;
		}

			System.out.println("Smallest number:"+min);
	}

	}

