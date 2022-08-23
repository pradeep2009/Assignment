package com.switchassignment;

import java.util.Scanner;

public class Greatest2Number {

	public static void main(String[] args) {
		int a,b;int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		a=sc.nextInt();
		System.out.print("enter the number :");
		b=sc.nextInt();
		sc.close();
		if(a>b)
		{
		  count--;
		}
		switch(count)
		{
		case 0:
			System.out.println(a+" is greater");
			break;
		case 1:
			System.out.println(b+" is greater");
		    break;
		 default :
			 System.out.println("both are equal");
		}

	}

}
