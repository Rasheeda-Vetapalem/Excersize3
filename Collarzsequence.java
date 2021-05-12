package com.ojas.inheritence;

import java.util.Scanner;

public class Collarzsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		while(number!=1) {
			if(number%2!=0) {
				number=number*3+1;
			}
			else {
				number=number/2;
				
			}
			System.out.println(number);
		}

	}

}
