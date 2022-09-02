package string.com;

import java.util.Scanner;

public class SmallDidt {
	
	public static void smallDigit(int num)
	{
		int temp;
		int small=num%10;
		while(num>0)
		{
			 temp=num%10;
			 if(small>temp)
			 {
				 small=temp;
			 }
			 num=num/10;
			 
		}
		System.out.println("smallest digit is: "+small);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		int num=sc.nextInt();
        smallDigit(num);
        sc.close();
	}

}
