package com.switchassignment;

import java.util.Scanner;

public class NumbertoWord {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :");
		num=sc.nextInt();
		sc.close();
		switch(num)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("Invalid input");
		
		}

	}

}
