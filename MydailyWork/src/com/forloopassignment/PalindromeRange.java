package com.forloopassignment;



public class PalindromeRange {

	public static void main(String[] args) {
		
		int num,sum=0,i,temp;
		
		for(num=100;num<=500;num++)
		{
			for(i=num;i>0;i=i/10)
			{
			temp=i%10;
			sum=sum*10+temp;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is palindrome");
		}
		else
		{
			System.out.println(num+" is not palindrome");
		}


	}

}
