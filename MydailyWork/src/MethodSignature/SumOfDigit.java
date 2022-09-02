package MethodSignature;

import java.util.Scanner;

public class SumOfDigit {
	
	public int sumofDigit(int no) {
		int temp,sum=0;
		while(no!=0)
		{
			temp=no%10;
			sum=sum+temp;
			no/=10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter the number: ");
		no=sc.nextInt();
		sc.close();
		SumOfDigit s=new SumOfDigit();
		int sum=s.sumofDigit(no);
		System.out.println("Sum of given number is: "+sum);
		

	}

}
