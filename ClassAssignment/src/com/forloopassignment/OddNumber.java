package com.forloopassignment;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		int num,i,oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number nth range :");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				oddsum=oddsum+i;
			}
		}
		System.out.println("odd number sum is "+oddsum);
	}

}
