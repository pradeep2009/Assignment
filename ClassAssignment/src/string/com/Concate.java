package string.com;
import java.util.Arrays;
import java.util.Scanner;

public class Concate {
	
	/*public void concate(String str,String str1)
	{
		//String s3=str.concat(str1);
		//System.out.println(s3);
		//String s4=str+str1;
		//System.out.println(s4);
		String s5="";
				for(int i=0;i<str.length();i++)
				{
					s5+=str.charAt(i);
				}
				for(int j=0;j<str1.length();j++)
				{
					s5+=str1.charAt(j);
				}
		System.out.println(s5);
	}*/
	
	public void copy(String str)
	{
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			s1+=str.charAt(i);
		}
		System.out.println("copy string: "+s1);
	}
	public void remove(String str,char c)
	{
		//char c1[]=str.toCharArray();
		String s2="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=c)
			{
				s2+=str.charAt(i);
			}
		}
		System.out.println("After removing character string will be: \n"+s2);
	}
	public void occurance(String str)
	{
		
		//System.out.println(Arrays.toString(ch1));
		char ch1[]=str.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]=='0')
				continue;
			int cnt=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch1[i]==ch1[j])
				{
					cnt++;
					ch1[j]='0';
				}
			}
			System.out.println(ch1[i]+" occures "+cnt+" times");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str=sc.nextLine();
		//System.out.println("Enter the second string: ");
		//String str1=sc.nextLine();
		System.out.println("Character to be remove:");
		char ch=sc.next().charAt(0);
		Concate c=new Concate();
		//c.concate(str, str);
		c.copy(str);
		System.out.println("________________________________");
		c.remove(str,ch);
		System.out.println("________________________________");
		c.occurance(str);
		
	}

}
