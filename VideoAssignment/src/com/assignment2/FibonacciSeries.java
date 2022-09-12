package com.assignment2;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,no1=0,no2=1,i,no3;
		System.out.print("Enter the Series terms: ");
		no=sc.nextInt();
		System.out.print(no1+" ");
		System.out.print(no2+" ");
		sc.close();
		for(i=2;i<=no;i++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(no3+" ");
		}
		

	}

}
