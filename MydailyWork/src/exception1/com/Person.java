package exception1.com;

import java.util.Scanner;

class AgeNotApplicableException extends RuntimeException
{
	public String showerror()
	{
		return "age not applicable for vaccine..";
	}
}

public class Person {
	
	int age,aadhar_no;
	String name;
	
	Person(int n,int a,String name)
	{
		age=n;
		aadhar_no=a;
		this.name=name;
	}
	
	public void checkEligibilityforVaccine()
	{
		if(age>16)
		{
			System.out.println("Applicable for vaccine:");
		}
		else
		{
			throw new AgeNotApplicableException();
		}
	}
	public String toString()
	{
		return "Name:"+name+"\nAge"+age+"\nAaddhar no"+aadhar_no;
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age");
	int n=sc.nextInt();
	System.out.println("Enter the aadhar no");
	int a=sc.nextInt();
	System.out.println("Enter the name");
	String s=sc.next();
     Person p=new Person(n,a,s);
     try
     {
     p.checkEligibilityforVaccine();
     }
     catch(AgeNotApplicableException e)
     {
    	 System.out.println("ERROR:"+e.showerror());
     }
     
	}

}
