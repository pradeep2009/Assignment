package com.oops;

public class Book2 {

	int b_id,b_price;
	String b_name;
	public void acceptDetails(int a,int b,String s)
	{
		b_id=a;
		b_price=b;
		b_name=s;
	}
	public void acceptDetails(Book2 obj)
	{
		b_id=obj.b_id;
		b_price=obj.b_price;
		b_name=obj.b_name;
	}
	public void display()
	{
		System.out.println("Book id: "+b_id);
		System.out.println("Book Price: "+b_price);
		System.out.println("Book Name: "+b_name);
	}
	public static void main(String[] args) {
		
		Book2 b1=new Book2();
		b1.acceptDetails(1,250,"zadap");
		b1.display();
		System.out.println("--------------------------");
		
		Book2 b2=new Book2();
		b2.acceptDetails(b1);
		b2.display();
		
		

	}

}
