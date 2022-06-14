package com.DSA.java;

import java.util.Scanner;

public class SimpleIntrest {
	
	public static void main(String[] args) {
		
		float si,p,t,r;
		
		Scanner in = new Scanner(System.in);
		
		p = in.nextFloat();
		t = in.nextFloat();
		r = in.nextFloat();
		
		si = (p*t*r); 
		si = (si/100);
		
		System.out.println("Simple intrest = "+si);
	}

}
