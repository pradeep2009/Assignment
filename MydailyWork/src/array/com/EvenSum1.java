package array.com;

public class EvenSum1 {
	
	public void sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];	
			}	
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
        EvenSum1 e=new EvenSum1();
        int a[]= {12,15,17,18,25,26};
        e.sum(a);
	}

}
