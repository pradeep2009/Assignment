package wrapping.com;

public class Society {
	public static void main(String ar[])
	{
		Flat s=new Society(23, "nager", "sai").new Flat(12,"Sachin");
		//MakeAudit.a;
		s.show();
		Society s1=new Society();
		s1.enjoyEvent();
		System.out.println("------------------");
		s1.makeclubHouseReady();
		System.out.println("------------------");
		s1.doTask1();
		
	}
	Society()
	{
		
	}
	public void enjoyEvent()
	{
		Clubhouse a=new Clubhouse() 
	
				{
			        public void conductgames()
			        {
			        	System.out.println("played cricket..");
			        	System.out.println("played vollyball..");
			        }
				};
				a.conductgames();
	}
  public void doTask1()
  {
	  Calculator a=new Calculator() {
		
		@Override
		public void add(int a, int b) {
			// TODO Auto-generated method stub
		System.out.println("Addition is: "+(a+b));	
		}
		
		@Override
		public void mult(int x, int y) {
			// TODO Auto-generated method stub
		System.out.println("Multiplication is:"+x*y);	
		}
	};
	a.add(12, 12);
	a.mult(4, 5);
	
	
  }
  public void makeclubHouseReady()
  {
	  Decorate d=new Decorate() {
		
		@Override
		public void makedecorate() {
			// TODO Auto-generated method stub
			System.out.println("society will be decorates..");
		}
	};
	d.makedecorate();
	
  }
	static int society_reg_no;
	String society_location;
	String society_name;
	Society(int n,String sl,String sn)
	{
		society_reg_no=n;
		society_location=sl;
		society_name=sn;
	}
	public void showDetails()
	{
		//Flat f=this.new Flat();
		System.out.println("Society reg.no:"+society_reg_no+"\nSociety_location: "+society_location+"\nSociety name: "+society_name);
	}
	static class MakeAudit{
		static String audit_name;
	   public void show()
	   {
		   System.out.println(society_reg_no);
		   System.out.println(society_location);
		   System.out.println(audit_name);
	   }
		
		
	}
	class Flat{
		int flat_no;
		String flat_owner_name;
		Flat()
		{
			
		}
		Flat(int n,String fn)
		{
			flat_no=n;
			flat_owner_name=fn;
		}
		public void show()
		{
			showDetails();
			System.out.println(Society.MakeAudit.audit_name);
			System.out.println("Flat no"+flat_no+"\nOwner name: "+flat_owner_name);
		}
	}
	
  
}
