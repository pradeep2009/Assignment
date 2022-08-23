package com.ifelse;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		num=sc.nextInt();
		if(num>0 && num%2==0)
		{
			System.out.println("Number is Even");
		}
		else 
		{
			System.out.println("Number is Odd");
		}
		sc.close();
		
	}

}
