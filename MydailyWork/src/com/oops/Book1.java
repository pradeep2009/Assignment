package com.oops;

public class Book1 {
	
	public void showLibrary(Book obj)
	{
		System.out.println("Book id: "+obj.book_id);
		System.out.println("Book price: "+obj.book_price);
		System.out.println("Book Name: "+obj.book_name);
		System.out.println("Book Author: "+obj.book_author);
		System.out.println("***************");
		obj.book_price=500;
		System.out.println("Book price: "+obj.book_price);
	}

	public static void main(String[] args) {
		
		Book b1,b2,b3,b4,b5;
		
		b1=new Book();
		b1.acceptBookDetails(1,320,4,"Vishwas","Viswas nagare");
		b1.showBookDetails();
		System.out.println("-----------------------------------");
		
		Book1 b8=new Book1();
		b8.showLibrary(b1);
		
		/*b2=new Book();
		b2.acceptBookDetails(2,580,8,"Vijeta","Bharat aandhale");
		b2.showBookDetails();
		System.out.println("-----------------------------------");
		
		b3=new Book();
		b3.acceptBookDetails(3,400,6,"Bharari","Pravin tarade");
		b3.showBookDetails();
		System.out.println("-----------------------------------");*/
		
		/*b4=new Book();
		b4.book_id=b1.book_id;
		b4.book_price=b1.book_price;
		b4.book_quantity=b1.book_quantity;
		b4.book_name=b1.book_name;
		b4.book_author=b1.book_author;
		b4.bill=b1.bill;
		b4.showBookDetails();
		System.out.println("-------------------------");
		System.out.println("b1 hashcode: "+b1.hashCode());
		System.out.println("b4 hashcode: "+b4.hashCode());
		
		System.out.println("-------------------------");
		
		b5=new Book();
		b5=b4;
		b5.showBookDetails();
		System.out.println("-------------------------");
		System.out.println("b5 hashcode: "+b5.hashCode());
		System.out.println("b4 hashcode: "+b4.hashCode());*/
		
		
		
		
		
		
	}

}
