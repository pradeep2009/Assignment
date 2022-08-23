package string.com;

public class Recursion {
	static int sum=0;
	public static int recursion(int n)
	{
		
		if(n!=0)
		{
			sum=sum+n;
			System.out.println(sum);
			return n=n+recursion(n-1);
		}
		else
		{
			return n;
		}
	}
	public static int fact(int n)
	{
		
		if(n!=0)
		{
			sum=sum+n;
			System.out.println(sum);
			return n=n+recursion(n-1);
		}
		else
		{
			return n;
		}
	}

	public static void main(String[] args) {
		int sum=Recursion.recursion(5);
		System.out.println(sum);
	}

}
