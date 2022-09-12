package constructorpoly.com;

public class JoiningDate {
	
	String day;
	int month,year;
	JoiningDate(String n,int m,int y)
	{
		day=n;
		month=m;
		year=y;
	}
	public String toString()
	{
		return "Day: "+day+"\nMonth: "+month+"\nYear: "+year;
	}

}
