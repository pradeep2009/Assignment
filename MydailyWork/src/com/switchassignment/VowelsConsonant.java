package com.switchassignment;

import java.util.Scanner;

public class VowelsConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch2;
		boolean isvowels=false;
		System.out.print("Enter the Alphabet:");
		ch2=sc.next().charAt(0);
		
		sc.close();
		switch(ch2)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			isvowels=true;
		}
		if(isvowels==true)
		{
			System.out.println(ch2+" is vowels");
		}
		else if((ch2>='a' && ch2<='z')||(ch2>='A' && ch2<='z'))
		{
			System.out.println(ch2+" is consonant");
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}
