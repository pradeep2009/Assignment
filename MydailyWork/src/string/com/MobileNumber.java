package string.com;

import java.util.Scanner;

public class MobileNumber {
	
	public static boolean checkMobile(String num)
	{
		boolean res=num.matches("[1-9][0-9]{9}");
				return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String num=sc.next();
		
		 
		 if(checkMobile(num))
		 {
			 System.out.println("valid mobile");
		 }
		 else
		 {
			 System.out.println("not valid");
		 }

	}

}
