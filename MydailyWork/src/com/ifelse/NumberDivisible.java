package com.ifelse;
import java.util.Scanner;

;

public class NumberDivisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter the Number:");
		no=sc.nextInt();
		if(no%5==0 && no%11==0)
		{
			System.out.println("Number is divisible 5 and 10");
		}
		else
		{
			System.out.println("number is not divisble 5 or 10");
		}
		
	}

}
