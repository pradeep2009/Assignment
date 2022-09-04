package stringprogr.com;

import java.util.Scanner;

public class PrimeNumberWhile {
	
	public void checkPrime(int no)
	{
		int n=2;
		int cnt=0;
		while(n<=no/2)
		{
			if(no%n==0)
			{
				cnt++;
				break;
			}
			n++;
		}
		if(cnt==0)
		{
			System.out.println(no+" is prime number");
		}
		else
		{
			System.out.println(no+" is not prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberWhile p=new PrimeNumberWhile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		p.checkPrime(no);

	}

}
