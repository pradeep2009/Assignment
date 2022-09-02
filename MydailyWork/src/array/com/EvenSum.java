package array.com;

import java.util.Scanner;

public class EvenSum {

	/*public void doEvenAddition(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
			}
		}
		System.out.println("odd sum of array: "+sum);
	}
	public void doAverage(int a[])
	{
		int avg=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			avg=sum/a.length;
		}
		System.out.println("average of array is: "+avg);
	}
	public void doAltEven(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even position: "+a[i]);
			}
		}
		
	}
	public void doAltOdd(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("odd position: "+a[i]);
			}
		}
		
	}*/
	public void doMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			
		}
	System.out.println("maximum number in array: "+max);
	}
	public void doMin(int a[])
	{
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
			
		}
	System.out.println("minimum number in array: "+min);
	}/*
	
	public int doSecondmax(int a[])
	{
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
			
		}
	return a[a.length-2];
	}
	public void doPrime(int no)
	{
		for(int i=0;i<a.length;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
			   		break;
				}
			}
			if(isPrime)
			{
				System.out.println(a[i]+"this are prime number");
			}	
		}
		
		
	}*/



		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the array size");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enter the array element");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			EvenSum s=new EvenSum();
			//s.doEvenAddition(a);
			//s.doAverage(a);
			//s.doAltEven(a);
			//s.doAltOdd(a);
			s.doMax(a);
			s.doMin(a);
			//int second_max=s.doSecondmax(a);
			//System.out.println("2nd highest max: "+second_max);
			//s.doPrime(a);
	}

}
