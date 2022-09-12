package constructorpoly.com;

public class Mydate {
	
	String day;int month,year;
	
	Mydate(String d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public String toString()
	{
		return "Day: "+day+"\nMonth: "+month+"\nYear: "+year;
	}

}
