package com.forloopassignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,sum=0,temp,i;
		System.out.print("Enter the number:");
		no=sc.nextInt();
		sc.close();
		for(i=no;i>0;)
		{
			temp=i%10;
			sum=sum*10+temp;
			i=i/10;	
		}
		if(sum==no)
		{
			System.out.println(no+" is palindrome");
		}
		else
		{
			System.out.println(no+" is not palindrome");
		}

	}

}
