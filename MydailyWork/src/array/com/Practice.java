package array.com;

import java.util.Scanner;
public class Practice {

	public void doSearch(int a[],int n)
	{
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==n)
			{
				System.out.println("number is present in the array");
				break;
			}
			
		}
		
	}
	public void doSearchIndex(int a[],int n)
	{
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==n)
			{
				
				System.out.println("number is present at position "+i);
				
			}
			
		}
		
	}
	public void doCount(int a[],int n)
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==n)
			{
				cnt++;
			}
		}
	  System.out.println("number is present "+cnt+" times.");
	}
	public void checkOccurence(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==-99)
				continue;
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				    cnt++;
				    a[j]=-99;
				}	
			}
			System.out.println(a[i]+" occurs at "+cnt+" times");
		}
	 }
	  
	



	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]= {6,3,7,5,9,3};
		System.out.println("enter the search number: ");
		int search=sc.nextInt();
		Practice p=new Practice();
		System.out.println("---------------------------");
		p.doSearch(a,search);
		System.out.println("---------------------------");
		p.doCount(a, search);
		System.out.println("---------------------------");
		p.doSearchIndex(a, search);
		System.out.println("---------------------------");
		p.checkOccurence(a);
		System.out.println("---------------------------");
		
    sc.close();
	}

}
