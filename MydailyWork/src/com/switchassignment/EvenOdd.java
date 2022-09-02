package com.switchassignment;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number :");
	num=sc.nextInt();
	sc.close();
	switch(num%2)
	{
	case 0:
		System.out.println("Number is even");
		break;
	case 1:
		System.out.println("Number is odd");
	
	}
  }

}
