package array.com;

import java.util.Scanner;
public class SumOfArray {

public void doAddition(int a[])
{
	int sum=0;
	for(int x:a)
	{
		sum+=x;
	}
	System.out.println("sum of array: "+sum);
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
		SumOfArray s=new SumOfArray();
		s.doAddition(a);

	}

}
