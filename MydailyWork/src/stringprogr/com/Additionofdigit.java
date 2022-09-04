package stringprogr.com;

import java.util.Arrays;
import java.util.Scanner;

public class Additionofdigit {
	
	public void checkNoDigit(String str)
	{
	  int cnt=0,sum=0;
	  
	  char s[]=str.toCharArray();
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i]>'0' && s[i]<'9')
		  {
			  System.out.println(s[i]);
			  sum+=Integer.parseInt(String.valueOf(s[i]));
			  cnt++;
		  }
	  }
	  float avg=sum/cnt;
	  System.out.println(avg);
	}
  public void checkLength(String str)
  {
	  String s[]=str.split(" ");
	  String max="";
	  System.out.println(Arrays.toString(s));
	  for(int i=0;i<s.length;i++)
	  {
		  for(int j=i+1;j<s.length;j++)
		  {
		      //if(s.length() > max)
		      {
		    	 //max+=s[i]; 
		      }
		    	  
		  }
	  }
	  System.out.println(max);
  }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		Additionofdigit x=new Additionofdigit();
		//x.checkNoDigit(str);
		x.checkLength(str);
        sc.close();
	}

}
