package array.com;

import java.util.Scanner;

public class ReverseArray {
	
	public void doReverse(int a[])
	{
		System.out.print("After reverse array is:");
		for(int i=a.length-1;i>=0;i--)
		{
		   System.out.print(a[i]+",");
			
		}
		
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
		ReverseArray s=new ReverseArray();
		s.doReverse(a);
		

	}

}
