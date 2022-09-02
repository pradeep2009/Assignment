package string.com;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {
	
	public static boolean checkAnagram(String first,String second)
	{
		boolean isAnagram=false;
		String str1=first.toLowerCase();
		String str2=second.toLowerCase();
		if(str1.length() == str2.length())
		{
		      char[] charArray1 = str1.toCharArray();
		      char[] charArray2 = str2.toCharArray();
		      Arrays.sort(charArray1);
		      Arrays.sort(charArray2); 
		      isAnagram = Arrays.equals(charArray1, charArray2);
		}
		else
		{
			return isAnagram;
		}
		
		return isAnagram;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		boolean isAnagram=Anagram1.checkAnagram(first, second);
        System.out.println(isAnagram);
	}

}
