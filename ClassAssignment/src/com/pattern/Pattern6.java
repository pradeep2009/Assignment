package com.pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j,n=4;
		int ch=97;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i ;j++)
			{
				System.out.print((char)(ch) +" ");
				ch++;
				
			}
			
	    	System.out.println();
		}


	}

}
