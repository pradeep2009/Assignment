package com.oops;

public class Book {
	
	int book_id,book_price,book_quantity;
	float bill;
	String book_name,book_author;
	public void acceptBookDetails(int b_id,int b_price,int b_qty,String b_name,String b_author) {
		book_id=b_id;
		book_price=b_price;
		book_name=b_name;
		book_author=b_author;
		book_quantity=b_qty;
		bill=book_quantity*book_price;
		
	}
	public void showBookDetails() {
		
		System.out.println("Book id: "+book_id);
		System.out.println("Book name: "+book_name);
		System.out.println("Book author: "+book_author);
		System.out.println("Book price: "+book_price);
		System.out.println("Book quantity: "+book_quantity);
		System.out.println("Pay bill: "+bill);
	}


}
