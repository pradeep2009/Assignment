package array.com;

public class Array1 {
	
	public void sum(int a[])
	{
		int sum=0;
		float avg=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
				sum=sum+a[i];
				count++;
			}
		}
		avg=sum/count;
		System.out.println("Average is: "+avg);
	}

	public static void main(String[] args) {
		Array1 a1=new Array1();
		int a[]= {12,15,28,45,26};
        a1.sum(a);
	}

}
