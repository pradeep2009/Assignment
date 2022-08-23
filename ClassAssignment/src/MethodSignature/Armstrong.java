package MethodSignature;

import java.util.Scanner;

public class Armstrong {
	
	public int armstrongNumber(int no)
	{
		int temp,total=0;
		while(no!=0)
		{
			temp=no%10;
			total=total+temp*temp*temp;
			no=no/10;	
		}
		return total;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.print("Enter the number:");
		no=sc.nextInt();
		sc.close();
		Armstrong am=new Armstrong();
		int total=am.armstrongNumber(no);
		if(total==no)
		{
			System.out.println(no+" is armstrong");
		}
		else
		{
			System.out.println(no+" is not armstrong number");
		}
		
	}

}
