package stringprogr.com;

import java.util.Arrays;
import java.util.Scanner;

public class Stringpro2 {
	
	public void checkString(String str)
	{
		String a[]=str.split(" ");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					if(a[i]==a[j])
					{
						System.out.println(Arrays.toString(a));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringpro2 s=new Stringpro2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		s.checkString(str);

	}

}
