package com.whileExample;

import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
		int no,large=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
		while(no!=0)
		{
			int r=no%10;
			if(large<r)
			{
				large=r;	
			}
			no=no/10;
			
		}
    System.out.println("max digit of the given number: "+large);
    sc.close();
	}

}
