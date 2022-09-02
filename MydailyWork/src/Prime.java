
public class Prime {

	public void checkPrime(int n)
	{
		int m;
		int flag=0;
		m=n/2;
		
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(n+" is prime");
			}
		
	}
	public static void main(String[] args) {
		Prime p=new Prime();
		int num=34;
		p.checkPrime(num);

	}

}
