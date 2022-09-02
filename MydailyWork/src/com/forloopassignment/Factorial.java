package com.forloopassignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1,fact=1,i;
		System.out.print("Enter the number:");
		no1=sc.nextInt();
		sc.close();
		for(i=1;i<=no1;i++)
		{
			fact=fact*i;	
		}
		System.out.println("Factorial is: "+fact);

	}

}
