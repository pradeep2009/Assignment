package com.forloopassignment;

public class Pattern3 {
  
	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
