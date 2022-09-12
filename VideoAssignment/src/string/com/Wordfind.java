package string.com;

import java.util.Arrays;
import java.util.Scanner;

public class Wordfind {

	public void occurenceWord(String str,String str1)
     {
		int count=0;
		String ch[]=str.split(" ");
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(str1.equals(ch[i]))
			count++;
			
		}
		System.out.println(str1+" is avalaible "+count+" times");
     }
	public void occurenceWord1(String str)
    {
		int cnt=0;
		char ch[] = str.toCharArray();
		//System.out.println(ch.length);
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]==' ')
				cnt++;
		}
		String words[] = new String[cnt+1];
		String word="";
		int j=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				word = word+ch[i];
			}
			else
			{
				words[j] = word;
				j++;
				word="";
			}
		}
		words[j]=word;
		System.out.println(Arrays.toString(words));
    }
	public void findOccur(String words[])
	{
		for(int i=0;i<words.length;i++)
		{
			if (words[i]=="0")
				continue;
			int cnt=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					cnt++;
					words[j]="0";
				}
			}
			System.out.println(words[i]+" occurs "+cnt+" times");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		//System.out.println("word: ");
		//String str1=sc.nextLine();
		Wordfind w=new Wordfind();
       // w.occurenceWord(str,str1);
        //w.occurenceWord1(str);
       String word[]=str.split(" ");
       w.findOccur(word);
	}

}
