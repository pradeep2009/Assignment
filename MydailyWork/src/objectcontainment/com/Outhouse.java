package objectcontainment.com;

public class Outhouse {
	
	int outhouse_no;
	String outhouse_area;
	
	Outhouse(int no,String area)
	{
		outhouse_no=no;
		outhouse_area=area;
	}
	public String toString()
	{
		return outhouse_no+" "+outhouse_area;
	}

}
