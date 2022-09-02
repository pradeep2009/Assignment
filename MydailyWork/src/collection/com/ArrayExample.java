package collection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayExample {
	
	public void reverse(ArrayList<String> l)
	{
		System.out.println("After reverse: ");
		for(int i=l.size()-1;i>=0;i--)
		{
			System.out.print(l.get(i)+" ");
		}
	}
	
	public void arrayAdd()
	{
		ArrayList<String> l=new ArrayList<>();
		System.out.println(l);
		System.out.println(l.size());
		l.add("hi");
		l.add("hello");
		l.add("good");
		l.add("morning");
		l.set(1, "night");
		System.out.println(l);
		System.out.println(l.size());
		reverse(l);
	}
	public void evenNumber()
	{
		ArrayList<Integer> l=new ArrayList<>();
		System.out.println(l);
		System.out.println(l.size());
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				l.add(i);
			}
		}
		System.out.println(l);
		
	}
	public void evenSum(ArrayList<Integer> l)
	{
		int sum=0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)%2==0)
			{
				sum=sum+l.get(i);
			}
		}
		System.out.println("Even sum is: "+sum);
		
	}

	public static void main(String[] args) {
		ArrayExample a=new ArrayExample();
        //a.arrayAdd();
        //a.evenNumber();
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<>();
		System.out.println("enter the size:");
		int num=sc.nextInt();
		System.out.println("Enter the number: ");
		for(int i=0;i<num;i++)
		{
			l.add(sc.nextInt());
		}
		
		System.out.println(l);
		a.evenSum(l);
	}

}
