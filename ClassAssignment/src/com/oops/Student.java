package com.oops;

public class Student {

	int roll_no,m1,m2,m3;
	float per;
	String name;
	
	public String toString()
	{
		String str="Roll no: "+roll_no+"Name: "+name+"Mark"+m1;
		return str;
	}
	Student()
	{
		
	}
	Student(int rno,String name,int mark)
	{
		this.name=name;
		this.roll_no=rno;
		this.m1=mark;
	}
	/*public void acceptDetails(int rno,int marks1,int marks2,int marks3,String sname) {
		
		roll_no=rno;
		m1=marks1;
		m2=marks2;
		m3=marks3;
		name=sname;
		
		per=(m1+m2+m3)*100/300;
	}

	public void showDetails() {
		System.out.println("Roll no: "+roll_no);
		System.out.println("Physic Marks : "+m1);
		System.out.println("Math Marks: "+m2);
		System.out.println("Science Marks: "+m3);
		System.out.println("Student Name: "+name);
		System.out.println("Percentage: "+per+"%");*/
		
	
}
