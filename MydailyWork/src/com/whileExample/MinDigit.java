package com.whileExample;

import java.util.Scanner;

public class MinDigit {

	public static void main(String[] args) {
		int no,small=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
		small=no%10;
		while(no!=0)
		{
			int r=no%10;
			if(small>r)
			{
				small=r;	
			}
			no=no/10;
			
		}
    System.out.println("min digit of the given number: "+small);
    sc.close();

	}

}
