package com.oops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base,pow;
		System.out.print("Enter the base: ");
		base=sc.nextInt();
		System.out.print("Enter the power: ");
		pow=sc.nextInt();
		Power1 p1;
		
		p1=new Power1();
		int p2=p1.acceptDetails(base,pow);
		System.out.println("Power "+base+"^"+pow+" is: "+p2);
       sc.close();
	}

}
