package interface1.com;

public class PrintingPress {

	public static void main(String[] args) {
		Edit e;
		e=new Magzine();
		e.read();
		e.update();
		e.write();
		System.out.println("------------------------");
		Printable p;
		p=new Newspaper();
		e=new Newspaper();
		e.read();
		e.update();
		//e.write();
		p.print();
		System.out.println("--------------------------------");
		Book b=new Book(101, "AGNI","VISHWASN", 800.0f);
		System.out.println(b.toString());
		System.out.println("----------------------------");
		e=new Magzine();
		e.read();
		e.update();
		e.write();
		
		

	}

}
