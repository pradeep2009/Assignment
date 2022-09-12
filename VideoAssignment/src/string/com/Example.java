package string.com;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		String a = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		String input_from_question=in.nextLine();
		int n=Integer.parseInt(input_from_question);
		input_from_question="";
		//String input_from_question1="";
		for(int i=1;i<n;i++)
		{
			input_from_question=input_from_question+i+" ";
			i=i*2;
			///input_from_question1=input_from_question1+i+" ";
			//System.out.println(input_from_question1);
			
		}
       System.out.println(input_from_question);
	}

}
