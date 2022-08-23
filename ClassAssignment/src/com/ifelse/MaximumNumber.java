package com.ifelse;
import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number: ");
		int no1=sc.nextInt();
		System.out.print("Enter The Number: ");
		int no2=sc.nextInt();
		System.out.print("Enter The Number: ");
		int no3=sc.nextInt();
		String msg=no1>=no2 && no1>=no3?no1+" is grater number":
			no2>=no1 && no2>=no3?no2 +" is greater number" :
				no3+" is grater number";
			System.out.println(msg);
	}

}
