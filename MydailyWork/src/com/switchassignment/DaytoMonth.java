package com.switchassignment;

import java.util.Scanner;

public class DaytoMonth {

	public static void main(String[] args) {
		int month,days=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the month :");
		month=sc.nextInt();
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
				days=30;
				break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				days=31;
				break;
		case 2:
			days=28;
			break;
			
	   }
		if(days!=0)
		{
			System.out.println("total day is: "+days);
		}
		else
		{
			System.out.println("you have entered invalid month");
		}

	}

}
