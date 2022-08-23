package com.whileExample;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		int no,temp,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
		i=1;
		while(no>0)
		{
			temp=no/10;
			count++;
		}
    System.out.println("count is :"+count);
	}

}
