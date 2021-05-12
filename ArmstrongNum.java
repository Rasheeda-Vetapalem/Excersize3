package com.ojas.inheritence;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int temp; 
       int rev=0;
       temp=num;
       while(num!=0){
    	   int rem=num%10;
    	   rev=rev+rem*rem*rem;
    	  num=num/10;
       }
       if(temp==rev){
    	   System.out.println("Armstrong number");
       }
       else
    	   System.out.println("Not ArmStrong number");
	}

}
