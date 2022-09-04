package stringprogr.com;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>n)
				{
					System.out.print((j+i-n)+" ");
				}
				else 
				{
					System.out.print((j+i)+" ");	
				}
			}
			System.out.println(" ");
		}

	}

}
