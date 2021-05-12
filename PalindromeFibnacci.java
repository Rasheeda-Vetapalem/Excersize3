package com.Rasheeda;

import java.util.Scanner;

public class PalindromeFibnacci 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=0,num2=1,num3=0;
		for(int index=2;index<=num;index++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;

		int temp = num3;
		int rev=0, rem = 0;
		while(temp > 0)
		{
		 rem=temp%10;
		 rev=(rev*10)+rem;
		temp=temp/10;	
		}
		if(num3==rev)
		 System.out.println(rev);
	  }
		sc.close();
	}

}