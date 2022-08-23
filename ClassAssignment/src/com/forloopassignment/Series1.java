package com.forloopassignment;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		int no,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		no=sc.nextInt();
		sc.close();
		System.out.println("series: ");
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		System.out.print(" ");
		}

	}

}
