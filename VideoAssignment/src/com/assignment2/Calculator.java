package com.assignment2;

import java.util.Scanner;

public class Calculator {
		
		 public static void main(String[] args)
		    {
		        Scanner sc=new Scanner(System.in);
		        int no1,no2,ch;
		        float result=0;
		        System.out.println("enter the number: ");
		        no1=sc.nextInt();
		        System.out.println("enter the number: ");
		        no2=sc.nextInt();
		        System.out.println("1.ADD 2.SUBTRACT 3.MULTIPLICATION 4.DIVISION ");
		        ch=sc.nextInt();
		        switch (ch) {
		        case 1:
		        		result=no1+no2;
		        		break;
		        case 2:
		        		result=no1-no2;
		        		break;
		        case 3:
		        		result=no1*no2;
		        		break;
		        case 4:
		        		result=no1/no2;
		        		break;
		        default :
		        	    System.out.println("Invalid option you have entered");
		       
		        }
		        System.out.println("The Result is = " + result);
			    
		    }

	}



