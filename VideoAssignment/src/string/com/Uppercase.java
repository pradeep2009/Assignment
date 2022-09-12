package string.com;

import java.util.Scanner;

public class Uppercase {
    
	public void lowercase(String str)
	{
		//String str1="";
		//str1=str.toLowerCase();
		//System.out.println(str1);
		String s6="";
		char c[]=str.toCharArray();
	     for(int i=0;i<str.length();i++)
	     {
	    	 if(c[i]>='A' && c[i]<='Z')
	    	 {
	    		 System.out.print(c[i]=(char) ((int) c[i] + 32));
	    	 }
	     }
//	     for(int i=0;i<str.length();i++)
//	     {
//	    	 if(str.charAt(i)>='A' && str.charAt(i)<='Z')
//	    	 {
//	    		 System.out.println(str=(String)((int)str.charAt(i) + 32));
//	    		 
//	    	 }
//	     }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String into uppecase: ");
		String str=sc.nextLine();
		Uppercase u=new Uppercase();
        u.lowercase(str);

	}

}
