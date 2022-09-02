package string.com;

import java.util.Scanner;

class Number {
	
	public static boolean findThree(int num)
	{
		boolean ispresent=false;
		while(num>0)
		{
			if(num%10==3)
			{
				return true;
			}
			num/=10;
		}
		return ispresent;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean isPresent=false;
		
		isPresent=Number.findThree(num);
		System.out.println(isPresent);

	}

}
