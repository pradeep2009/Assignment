package com.ifelse;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the input: ");
        char ch=sc.next().charAt(0);
        if(ch>='a' &&ch<='z' ||ch>='A' &&ch<='Z')
        {
        	System.out.println("THIS IS ALPHABET:");
        }
        else if(ch>='0' && ch<='9')
        {
        	System.out.println("THIS IS NUMBER");
        }
        else
        {
        	System.out.println("THIS IS SPECIAL CHARACTER");
        }
        
	}

}

