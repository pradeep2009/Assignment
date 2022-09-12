package com.assignment2;


public class PrimeNumber {

	public static void main(String[] args) {
		
		int no=3,i,flag=0;
		
		for(i=2;i<no/2;i++)
		{
			
		   if(no%i==0)
		   {
			 flag=1;
		   }
		}
		if(true)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
	}

}
