package MethodSignature;

import java.util.Scanner;

public class MinDigit {

	public int minDigit(int no) {
		int small=0;
		small=no%10;
		while(no !=0)
		{
			int r=no%10;
			if(small>r)
			{
				small=r;
			}
			no/=10;
			
		}
		return small;
	}
	
	public static void main(String[] args) {
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		no=sc.nextInt();
		sc.close();
		MinDigit md=new MinDigit();
		int min=md.minDigit(no);
		System.out.println("min digit of given number is:"+min);
	}
}
