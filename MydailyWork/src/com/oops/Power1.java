package com.oops;

public class Power1 {
	
	int base,expon;
	
	public int acceptDetails(int x,int n)
	{
		int i,power=1;
		base=x;
		expon=n;
		for(i=1;i<=expon;i++) {
		   power=x*power;
		}
		return power;
	}
	

}
