package objectcontainment.com;

public class Bangalow {
	
	String B_name;
	String B_area;
	String B_owner;
	Outhouse o1;
	Bangalow(String n,String a,String o,Outhouse o2)
	{
		B_name=n;
		B_area=a;
		B_owner=o;
		o1=o2;
	}
	public String toString()
	{
		return B_name+" "+B_area+" "+B_owner+" "+o1;
	}

}
