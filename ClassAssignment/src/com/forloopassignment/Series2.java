package com.forloopassignment;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,i,prev=0;
		System.out.print("Enter the number:");
		no=sc.nextInt();
		sc.close();
		System.out.println("series: ");
		for(i=1;i<=no;i++)
		{
			prev=prev*2+1;
			System.out.print(prev+",");
	
		}


	}

}
