package com.ifelse;

import java.util.Scanner;

public class DaytoMonth {

	public static void main(String[] args) {
		int month;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the month :");
		month=sc.nextInt();
		if(month==1 || month==3 || month==5 ||month==7 ||month==8 ||month==11 ||month==12)    
		{
			System.out.println("total days is 31");
		}
		else if(month==4 || month==6 || month==9 ||month==11)
		{
			System.out.println("total days is 30");
		}
		else if(month==2)
		{
			System.out.println("total days is 28/29");
		}
		else
		{
			System.out.println("invalid input please enter 1-12");
		}
		sc.close();
	}

}
