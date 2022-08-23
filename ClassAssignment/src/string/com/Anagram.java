package string.com;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void checkAnagram(String str1,String str2)
	{
		if(str1.length() == str2.length())
		{
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2); 
		      boolean result = Arrays.equals(charArray1, charArray2);
		      if(result) {
		          System.out.println(str1 + " and " + str2 + " are anagram.");
		        }
		        else {
		          System.out.println(str1 + " and " + str2 + " are not anagram.");
		        }
		      }
		      else {
		        System.out.println(str1 + " and " + str2 + " are not anagram.");
		      }
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str1=sc.nextLine();
		System.out.println("Enter the String2: ");
		String str2=sc.nextLine();
		str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    checkAnagram(str1, str2);
		sc.close();

	}

}
