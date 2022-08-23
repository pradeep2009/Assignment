package com.forloopassignment;

import java.util.Scanner;

public class TableNumber1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		loop1:
		for(i=2;i<=10;i++)
		{
			if(i==6)
				continue;
			for(j=1;j<=10;j++)
			{
				if(j==5)
					continue loop1;
			System.out.print(i*j+" ");
			}
		System.out.println();	
		System.out.println("-----------------------");	
		}
		sc.close();

	}

}
