package com.ifelse;
import java.util.Scanner;
public class VowelsConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch2;
		System.out.print("Enter the Alphabet:");
		ch2=sc.next().charAt(0);
		char ch1=Character.toLowerCase(ch2);
		sc.close();
		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
		{
			System.out.println("THIS IS VOWELS");
		}
		else
		{
			System.out.println("THIS IS CONSONANT");
		}

	}

}
