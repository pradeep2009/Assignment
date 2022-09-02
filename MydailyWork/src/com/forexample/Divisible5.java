package com.forexample;

public class Divisible5 {

	public static void main(String[] args) {
		int i,no=50,count=0;
		for(i=1;i<=50;i++)
		{
			if(i%5==0)
			{
				count++;
			}
		}
      System.out.println("1-50 number divisible by 5 is"+count);
	}

}
