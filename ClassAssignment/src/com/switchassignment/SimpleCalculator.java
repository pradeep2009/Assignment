package com.switchassignment;

import java.util.Scanner;

public class SimpleCalculator {
	
	 public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int no1,no2;
	        float result=0;
	        System.out.println("enter the number: ");
	        no1=sc.nextInt();
	        System.out.println("enter the number: ");
	        no2=sc.nextInt();
	        System.out.println("which operation perform+,-,*,/ put that sign: ");
	        char ch=sc.next().charAt(0);
	        switch (ch) {
	        case '+':
	        		result=no1+no2;
	        		break;
	        case '-':
	        		result=no1-no2;
	        		break;
	        case '*':
	        		result=no1*no2;
	        		break;
	        case '/':
	        		result=no1/no2;
	        		break;
	        default :
	        	    System.out.println("invalid option you have entered");
	       
	        }
	        System.out.println("The Result is = " + result);
		    
	    }

}
