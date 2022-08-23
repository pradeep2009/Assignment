package com.ifelse;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int basic_sal;float da,hra,gross_sal;
		System.out.print("Enter the basic salary:");
		basic_sal=sc.nextInt();
		sc.close();
		if(basic_sal<=10000)
		{
			da=basic_sal*0.8f;
			hra=basic_sal*0.2f;
		    
		}
		else if(basic_sal>10000 && basic_sal<=20000)
		{
			da=basic_sal*0.9f;
			hra=basic_sal*0.25f;
		    
		}
		else
		{
			da=basic_sal*0.95f;
			hra=basic_sal*0.3f;
		    
		}
		gross_sal=basic_sal+da+hra;
      System.out.println("Gross salary: "+gross_sal);
	}

}
