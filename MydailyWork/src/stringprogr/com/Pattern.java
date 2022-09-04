package stringprogr.com;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int column3;
		for(int i=0;i<6;i++)
		{
			int column1=0;
			int column2=1;
			for(int j=0;j<i+1;j++)
			{
				if(j==0)
				{
				  System.out.print(column1+" ");
				}
				else if(j==1)
				{
				  System.out.print(column2+" ");
				}
				else
				{
					column3=column1+column2;
					column1=column2;
					column2=column3;
					System.out.print(column3+" ");
				}
			}
			System.out.println();
		}

	}

}
