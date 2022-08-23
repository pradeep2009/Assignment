package com.pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int i,j,n=4;
		char ch='a';
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i ;j++)
			{
				System.out.print(ch+" ");
				
			}
			ch++;
	    	System.out.println();
		}
	}

}
