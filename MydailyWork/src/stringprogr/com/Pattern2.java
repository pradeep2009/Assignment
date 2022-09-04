package stringprogr.com;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5,a,b;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				a=1;
				b=0;
			}
			else
			{
				b=1;
				a=0;
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
				System.out.print(a+" ");
				}
				else
				{
				System.out.print(b+" ");
				}
			}
			System.out.println();
		}

	}

}
