package com.forloopassignment;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int no,square=0;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		no=sc.nextInt();
		square=no*no;
		while(no!=0)
		{
			  if(no%10 == square%10)
				 flag=false;
			  no=no/10;
			  square=square/10;
			
		}
		if(flag==true)
		{
			System.out.println("Number is automorphic");
		}
		else
		{
			System.out.println("Number is not automorphic");
		}
	sc.close();	

	}

}
