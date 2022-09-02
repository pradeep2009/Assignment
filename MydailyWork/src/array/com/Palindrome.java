package array.com;

import java.util.Scanner;

public class Palindrome {
	
	public void palindrome1(int n)
	{
		int sum=0;
		int num1=n;
		while(n>0)
		{
			int r=n%10;
			 sum=sum*10+r;
			 n/=10;
		}
		if(sum==num1)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	public void palindrome12(String str)
	{
		
		
		char ch[]=str.toCharArray();
		String s=new String(ch);
		//System.out.println(s);
		String sum="";
		for(int i=ch.length-1;i>=0;i--)
		{
			if(ch[i]!=' ')
			{
				sum+=ch[i];
				System.out.println(sum);
			}
		}
		if(sum.equals(str))
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number");
		//int num=sc.nextInt();
		//p.palindrome1(num);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		p.palindrome12(str);
        sc.close();
	}

}
