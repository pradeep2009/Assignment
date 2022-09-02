package string.com;

import java.util.Arrays;

public class Reverse {
	
	public void sum(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
		  if(str.charAt(i)>='0' && str.charAt(i)<='9')
		  {
			sum+=Integer.parseInt(String.valueOf(str.charAt(i))) ;
		  }
		}
		System.out.println(sum);
	}
	public void sum1(String str)
	{
		String temp="0";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		    if(Character.isDigit(ch))
		      {	 
				temp+=ch;
				if(i==str.length()-1)

				       sum+=Integer.parseInt(temp);
					
			  }
		    else
		    {
		       sum+=Integer.parseInt(temp);
		       temp="0";
		    }
		    
		}
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
		String s="dff1sdf51sf1";
		String str1="dff1sdf51sf1";
		Reverse s1=new Reverse();
		s1.sum(s);
        s1.sum1(str1);
	}

}
