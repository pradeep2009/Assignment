package com.forloopassignment;

import java.util.Scanner;

public class Krishnmurti {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no,m,sum=0,i;
		System.out.print("Enter the number:");
		no=sc.nextInt();
		sc.close();
		m=no;
		while(no!=0)
		{
			int d=no%10;
			int fact=1;
				for(i=1;i<=d;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				no=no/10;
		}
		if(sum==m)
		{
			System.out.println("krishnyamurti number:");
		}
		else
		{
			System.out.println("Not krishnyamurti number:");
		}
		
		

	}

}
