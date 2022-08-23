package exception1.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	
	public void avg()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		
			for(int i=0;i<a.length;i++)
			{
				sum+=a[i];
			}
			float avg=sum/a.length;
			System.out.println("AVERAGE IS:"+avg);
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException | InputMismatchException e)
		{
			if(e instanceof ArithmeticException)
			{
				System.out.println("pleasse enter array  size is grater than 0");
			}
		    else if(e instanceof ArrayIndexOutOfBoundsException)
		    {
			 System.out.println("please enter the element in given size..");
		     }
			else
			{
				System.out.println("please enter only number");
			}
				
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("something went wrong..");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("I am in final Block..");
		}
		
	}

	public static void main(String[] args) {
		Example e=new Example();	
        e.avg();
	}

}
