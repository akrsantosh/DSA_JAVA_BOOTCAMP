package com.DSA.java;

import java.util.Scanner;

public class EvenOddNum {

	
	public static void main(String []args) {
		
				int i = 2;
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter the number:");
				int j = input.nextInt();
				while ( j != 0 && input != null) {
					
					if (j%i == 0) {
						System.out.println(+j +"This is a even number");
					}
					else {
					System.out.println(+j +" This is not an even number");
					}
					
					return;
				}
				System.out.println("Please enter the number:");
				input.nextInt();
	
	}
	
	
	
}
