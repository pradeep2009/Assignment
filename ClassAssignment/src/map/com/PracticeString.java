package map.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PracticeString {
	
	public void checkoccurence(String str)
	{
		HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
		  
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			Integer val = map.getOrDefault(str.charAt(i), 0);
			map.put(str.charAt(i), val+1);
		}
	
		System.out.println(map);

	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		PracticeString p=new PracticeString();
		p.checkoccurence(str);

	}

}
