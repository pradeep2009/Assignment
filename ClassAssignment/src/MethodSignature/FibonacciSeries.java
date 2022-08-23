package MethodSignature;

import java.util.Scanner;

public class FibonacciSeries {
	
	public void fibonacciSeries(int no) {
		int no1=0,no2=1,i,no3=0;
		System.out.print(no1+" ");
		System.out.print(no2+" ");
		for(i=2;i<=no;i++)
		{
			no3=no1+no2;
			no1=no2;
			no2=no3;
			System.out.print(no3+" ");
		}	
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter the Series terms should be greater than 2: ");
		no=sc.nextInt();
		sc.close();
		FibonacciSeries fs=new FibonacciSeries();
		fs.fibonacciSeries(no);
	}

}
