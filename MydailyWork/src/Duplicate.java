import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int a[]= {2,4,3,4,5,6,7,1,3};
		String s="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==num)
				{
					s=a[i]+" "+a[j];
					System.out.println(s);
				}
			}
		}
		//System.out.println(s);
		sc.close();
	}
  
}
