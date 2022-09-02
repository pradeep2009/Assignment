package array.com;

import java.util.Scanner;

public class DuplicateElement {
	
	public void searchDuplicate(int a[])
	{
		System.out.println("Duplicates element are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[j]);
				}
			}
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
		DuplicateElement d1=new DuplicateElement();
		d1.searchDuplicate(a);
	}

}
