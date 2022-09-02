package MethodSignature;

import java.util.Scanner;

public class Factorial {

	public int factorialNumber(int no) {
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter the number: ");
		no=sc.nextInt();
		Factorial fc=new Factorial();
		int fact=fc.factorialNumber(no);
		System.out.println("factorial of given number is: "+fact);
		sc.close();
		
	}

}
