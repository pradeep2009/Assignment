package com.ifelse;

import java.util.Scanner;

public class PositiveNegative {
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		num=sc.nextInt();
		if(num>0)
		
			System.out.println("Number is positive");
		
		else if(num<0)
		
			System.out.println("number is negative");
		
		else
			System.out.println("number is zero");
			
		
	}


}
