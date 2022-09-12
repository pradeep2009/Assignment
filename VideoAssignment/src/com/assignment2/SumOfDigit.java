package com.assignment2;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1,sum=0,no,i;
		System.out.print("Enter the number:");
		no1=sc.nextInt();
		sc.close();
		for(i=1;i<=no1;i++)
		{
			no=no1%10;
			no1=no1/10;
			sum+=no;	
		}
		System.out.println("Sum of Digit is: "+sum);

	}

}
