package com.whileExample;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		int no,temp,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
	     i=1;
		while(no>0)
		{
			temp=no%10;
			sum=(sum*10)+temp;
		}
    System.out.println("Reverse Number is :"+sum);

	}

}
