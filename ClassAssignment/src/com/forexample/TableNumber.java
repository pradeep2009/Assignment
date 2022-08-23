package com.forexample;
import java.util.Scanner;
public class TableNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,i;
		System.out.println("enter the number");
		no=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(no*i);
		}
		sc.close();

	}

}
