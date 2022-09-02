package com.forloopassignment;

import java.util.Scanner;

public class Evenall {

	public static void main(String[] args) {
		int num,i,evensum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number nth range :");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
				
			}
		}
		System.out.println("even number sum is "+evensum);
	}

}
