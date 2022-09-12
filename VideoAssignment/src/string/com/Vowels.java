package string.com;

import java.util.Arrays;
import java.util.Scanner;

public class Vowels {
	
	public void countOccurence(String str)
	{
		String s1=str.toLowerCase();
		char ch1[]=s1.toCharArray();
		
		int vowels=0,consonant=0,digit=0;
		//System.out.println(Arrays.toString(ch1));
		for(int i=0;i<ch1.length;i++)
		{
			if((ch1[i]=='a' || ch1[i]=='e' || ch1[i]=='o' ||ch1[i]=='i' ||ch1[i]=='u'))
			{
				vowels++;	
			}
		   else if(ch1[i]>'0' && ch1[i]<'9')
		   {
			   digit++;
		   }
		   else
		   {
			   consonant++;
		   }
		}
		System.out.println("Vowels in given string: "+vowels);
		System.out.println("Consonant in given string: "+consonant);
		System.out.println("Digit and whitespace is: "+digit);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
        Vowels v=new Vowels();
        v.countOccurence(str);
	}

}
