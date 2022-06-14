package com.DSA.java;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
	
		float a,b,c;
		String o;
		
		Scanner in = new Scanner (System.in);
		
		a = in.nextFloat();
		o = in.next();
		b = in.nextFloat();
		
		
		if (o.equalsIgnoreCase("+")) {
			
			c = a+b;
			System.out.println("Sum of "+a+","+b+" ="+c);
		
			
		}
		
		else if (o.equalsIgnoreCase("-")) {
			
			c = a-b;
			System.out.println("Difference between "+a+","+b+" = "+c);
		
			
		}
		
		else if (o.equalsIgnoreCase("*")) {
			
			c = a*b;
			System.out.println("Multiplication of "+a+ "," +b+" = "+c);
		
			
		}
		
		else if(o.equalsIgnoreCase("/")) {
			
			c = a/b;
			System.out.println("Division of "+a+ "," +b+" = "+c);
		
			
		}
		else {
			return;
		}

	}

}
