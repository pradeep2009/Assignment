import java.util.Arrays;
import java.util.Scanner;

public class Example {
	
	public int secondhighest(int a[])
	{
	
	int temp=0;
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
	 return a[a.length-1];
}
	public int secondhighest1(int a[])
	{
	
	int temp=0;
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
	 return a[a.length-2];
}

	public static void main(String[] args) {
		
		Example e=new Example();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array: ");
		String str=sc.nextLine();
		//System.out.println(str);
		
		String b[]=str.split(" ");
		System.out.println(Arrays.toString(b));
		int size=b.length;
		int a[]=new int[size];
		for(int k=0;k<size;k++)
		{
			a[k]=Integer.parseInt(b[k]);
		}
		System.out.println(Arrays.toString(a));
		int max=e.secondhighest(a);
		System.out.println("maximum: "+max);
		//int secondmax=e.secondhighest1(a);
		//System.out.println("second max: "+secondmax);
		/*char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
				}
			}
		}*/
		

	}

}
