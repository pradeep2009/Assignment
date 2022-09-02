package array.com;

import java.util.Scanner;

public class SecondMin {
	
	public int smallest = Integer.MAX_VALUE;
	public int secondMin(int a[])
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
	return a[1];
	       
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter an array size.");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter  the array : ");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        sc.close();  
        SecondMin s=new SecondMin();
        int secondmin=s.secondMin(numbers);
        System.out.println("second minimum in given array is: "+secondmin);

	}

}
