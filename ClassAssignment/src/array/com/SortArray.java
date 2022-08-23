package array.com;

import java.util.Arrays;

public class SortArray {
	
	public void selectSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			int minIdx=i;
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[j]<a[minIdx])
				{
					minIdx=j;
				}
			}
			int temp=a[minIdx];
			a[minIdx]=a[i];
			a[i]=temp;
			
		}
		System.out.println("Selection sort asc.order:\n "+Arrays.toString(a));	
		
	}
	
	public void descSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			
			}
			
		}
		System.out.println("Bubble sort desc.order:\n "+Arrays.toString(a));	
	}

	public static void main(String[] args) {
		
		int arr1[]= { 1,8,8,4,2};
		SortArray s=new SortArray();
		s.descSort(arr1);
		s.selectSort(arr1);

	}

}
