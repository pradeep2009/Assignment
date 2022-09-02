package com.forloopassignment;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		int no,temp=0,i,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
		for(i=no;i>0;i=i/10)
		{
			temp=i%10;
			count++;
		}
    System.out.println("count is :"+count);
    sc.close();
	}
 
}
