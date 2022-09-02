package objectcontainment.com;

public class Branch {
	
	private int b_id;
	private String b_name;
	private Subject obj;
	public void setB_id(int id)
	{
		b_id=id;
	}
	public int getB_id()
	{
		return b_id;
	}
	public void setB_name(String name)
	{
		b_name=name;
	}
	public String getB_name()
	{
		return b_name;
	}
	public void setObj(Subject obj)
	{
		this.obj=obj;
	}
	public Subject getObj()
	{
		return obj;
	}
	public String toString()
	{
		 return "Branch_Id: "+b_id+"\nBranch_name: "+b_name+"\n"+obj;
	}

}
