package com.ojas.inheritence;

public class StudentTest {

	public static void main(String[] args) {
		DayScholor student = new DayScholor(123,"John Smit",100.0,500);
		System.out.println(student.displayDetails());
		System.out.println("Total amount you have to pay "+student.payFee(5000.0));
		
		Hosteller hosteller = new Hosteller(123,"John Smit",100.0,5000);
		System.out.println(hosteller.displayDetails());
		System.out.println("Total amount you have to pay "+hosteller.payFee(10000));
	}

}
