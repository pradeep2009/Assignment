package string.com;

import java.util.Scanner;

public class SecondOccurence {
	
	public void occurenceSecond(String str,char ch)
	{
		int index2=str.indexOf(ch);
		System.out.println("Index of the second occurrence of " 
                + " character \'" + ch + "\' is: "+ index2);
		int index=str.indexOf(ch, str.indexOf(ch) + 1);
		System.out.println("Index of the second occurrence of " 
                + " character \'" + ch + "\' is: "+ index);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("Character: ");
		char ch=sc.next().charAt(0);
		SecondOccurence s=new SecondOccurence();
        s.occurenceSecond(str,ch);

	}

}
