package array.com;

import java.util.Scanner;

public class SecondMax {
	
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
		
		SecondMax s=new SecondMax();
		int secondmax=s.doSecondmax(a);
		System.out.println("second max array number is "+secondmax);

	}

}
