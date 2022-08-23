package array.com;

import java.util.Scanner;

public class Practice12 {
	
	public void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public int factorial12(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*factorial12(n-1));
		}
	}
	public int sumofdigit(int n)
	{
		int temp=0;
		int sum=0;
		while(n>0)
		{
			temp=n%10;
			sum=sum+temp;
			n/=10;
			
		}
		return sum;
	}
	public void odd(int n)
	{
		if(n%2!=0)
		{
			System.out.println("odd number");
		}
	}
	public void sumodd(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
	}
	public void max(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	public void fibonacci()
	{
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {
		Practice12 p=new Practice12();
	    Scanner sc=new Scanner(System.in);
	    //System.out.println("Enter the number:");
	   // int n=sc.nextInt();
	   // p.factorial(n);
       // int d=p.factorial12(n);
        //System.out.println(d);
        //int s=p.sumofdigit(n);
       // System.out.println(s);
	   // p.odd(n);
	    System.out.println("Enter the size:");
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the array element:");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    //p.sumodd(a);
	    //p.max(a);
	    p.fibonacci();
	}

}
