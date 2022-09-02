import java.util.Scanner;

public class BinaryConvert {
	
	public void convert(int n)
	{
		int a[]=new int[30];
		int index=0;
		while(n>0)
		{
			a[index++]=n%2;
			n=n/2;
		}
		for(int i = index-1;i >= 0;i--){    
		       System.out.print(a[i]);    
		     }    
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		BinaryConvert b=new BinaryConvert();
		b.convert(n);

	}

}
