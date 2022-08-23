package com.forloopassignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,temp,total=0,i;
		System.out.print("Enter the number:");
		no=sc.nextInt();
		
		sc.close();
		i=1;
		for(i=no;i>0;)
		{
			temp=i%10;
			total=total+temp*temp*temp;
			i=i/10;	
		}
		if(total==no)
		{
			System.out.println(no+" is armstrong");
		}
		else
		{
			System.out.println(no+" is not armstrong number");
		}

	}

}
