package array.com;

import java.util.Scanner;

public class Arrayex {
	
	
	
	public void acceptArray(int a[],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=n;
		}
	}
	
	public void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		 int size=sc.nextInt();
	      int a[]=new int[size];
		
		System.out.print("enter the array: ");
		
		Arrayex a1=new Arrayex();
		a1.acceptArray(a,size);
		System.out.println("array elemnts are: ");
		a1.display(a);
		
	

	}
	
	
}
