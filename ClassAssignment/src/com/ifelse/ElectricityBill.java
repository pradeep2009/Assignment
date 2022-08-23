package com.ifelse;

import java.util.Scanner;

public class ElectricityBill {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int el_unit;float e_bill;
		System.out.print("Enter the electricity consumption unit:");
		el_unit=sc.nextInt();
		sc.close();
		if(el_unit<=50)
		{
			e_bill=el_unit*0.50f;    
		}
		else if(el_unit>50 && el_unit<=150)
		{
			e_bill=el_unit*0.75f;
     	}
		else if(el_unit>150 && el_unit<=250)
		{
			e_bill=el_unit*1.20f;
		}
		else
		{
			e_bill=el_unit*1.20f*0.2f;
		}
		
      System.out.println("Electricity Bill is : "+e_bill);
	}

}
