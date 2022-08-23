package com.whileExample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int no,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
		i=1;
		while(i<=no)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial is :"+fact);
    sc.close();
	}

}
