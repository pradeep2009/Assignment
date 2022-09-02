package array.com;

public class Example {
	
	public int sumArray(int a[])
	{
		int total=0;
		for(int sum:a)
		{
			total+=sum;
		}
		return total;
	}
	public int evenArray(int a[])
	{
		int total=0;
		for(int num:a)
		{
			if(num%2==0)
			{
				total+=num;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		
		int a[]= {15,25,12,31,14};
		Example e=new Example();
		int sum=e.sumArray(a);
		int sum1=e.evenArray(a);
		System.out.println("sum of array: "+sum);
		System.out.println("even sum of array: "+sum1);

	}

}
