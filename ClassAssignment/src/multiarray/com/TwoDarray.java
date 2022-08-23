package multiarray.com;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
	
	public void showArray(int a[][])
	{
		System.out.println("Array will be this:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void squareArray(int a[][])
	{
		System.out.println("Array will be this:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				   System.out.print(a[i][j]*a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void evenArray(int a[][])
	{
		System.out.println("even Array will be this:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
				{
				   System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	public void maxinRows(int a[][])
	{
		int ans[]=new int[a.length];
		//System.out.println("max in each rows Array will be this:");
		for(int i=0;i<a.length;i++)
		{
			int max=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
				ans[i]=max;
			}
			
		}
		System.out.println("maximum in each row array: "+Arrays.toString(ans));
	}
	
	public void mininRows(int a[][])
	{
		int ans[]=new int[a.length];
		//System.out.println("max in each rows Array will be this:");
		for(int i=0;i<a.length;i++)
		{
			int min=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
				}
				ans[i]=min;
			}
		
		}
		System.out.println("minimum in each row array: "+Arrays.toString(ans));
	}
	public void mininColumn(int a[][])
	{
		int ans[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				int min=a[0][j];
				if(min>a[i][j])
				{
					min=a[i][j];
				}
				ans[j]=min;
			}
			
		}
		System.out.println("minimum in each column array: "+Arrays.toString(ans));
	}
	public void maxinColumn(int a[][])
	{
		int ans[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				int max=a[0][j];
				if(max<a[i][j])
				{
					max=a[i][j];
				}
				ans[j]=max;
			}
			
		}
		System.out.println("maximum in each column array: "+Arrays.toString(ans));
	}
	

	public static void main(String[] args) {
		
		TwoDarray t=new TwoDarray();
		int row, col, i, j;
	    
	    Scanner sc = new Scanner(System.in);

	   
	    System.out.print("Enter row for the array  : ");
	    row = sc.nextInt();
	    System.out.print("Enter column for the array : ");
	    col = sc.nextInt();
	    int arr[][] = new int[row][col];
	    
	    
	    for (i = 0; i < row; i++) {
	      for (j = 0; j < col; j++) {
	        arr[i][j] = sc.nextInt();
	      }
	    }
	    
       //t.showArray(arr);
	    t.squareArray(arr);
	    System.out.println("_____________________________");
	    t.evenArray(arr);
	    System.out.println("_____________________________");
	    t.maxinRows(arr);
	    System.out.println("_____________________________");
	    t.mininRows(arr);
	    System.out.println("_____________________________");
	    t.mininColumn(arr);
	    System.out.println("_____________________________");
	    t.maxinColumn(arr);
	    System.out.println("_____________________________");
	}

}
