package array.com;

import java.util.Scanner;
public class Factorial {
public void fact(String str)
{
	int num=Integer.parseInt(str);
	int fact=1;
	String outp="";
	int count=1;
	while(count<=num)
	{
		fact=fact*count;
		if(fact>num)
		{
			break;
		}
		outp+=fact+" ";
		
		count++;
	}
	System.out.println(outp);
}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		String str=sc.nextLine();
		Factorial f=new Factorial();
		f.fact(str);
       sc.close();
	}

}
