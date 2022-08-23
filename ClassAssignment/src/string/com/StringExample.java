package string.com;

import java.util.Scanner;

public class StringExample {
	
	public void reverse(String str)
	{
		char ch[]=str.toCharArray();
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		System.out.println(rev); 
	}
	public void checkCharacter(String str,char ch)
	{
		char ch1[]=str.toCharArray();
		int cnt=0;
		boolean b=false;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch==ch1[i])
			{
				b=true;
				cnt++;
			}
		}
		if(b)
		{
			System.out.println("character is present");
			System.out.println(cnt+" times: ");
			
		}
		else
		{
			System.out.println("not present:");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		StringExample s=new StringExample();
		s.reverse(str);
		System.out.println("Accept character:");
		char ch=sc.next().charAt(0);
		s.checkCharacter(str, ch);
	
		
		

	}

}
