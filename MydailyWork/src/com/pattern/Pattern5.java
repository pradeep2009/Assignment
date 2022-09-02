package com.pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int i,j,n=4;
		int ch=97;
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i ;j++)
			{
				System.out.print((char)(ch+j) +" ");
				
			}
			
	    	System.out.println();
		}

	}

}
