package objectcontainment.com;

public class Subject {
	
	private int s_id;
	private String s_name;
	private Topic obj;
	public void setS_id(int id)
	{
		s_id=id;
	}
	public int getS_id()
	{
		return s_id;
	}
	public void setS_name(String name)
	{
		s_name=name;
	}
	public String getS_name()
	{
		return s_name;
	}
	public void setObj(Topic obj)
	{
		this.obj=obj;
	}
	public Topic getObj()
	{
		return obj;
	}
	public String toString()
	{
		 return "Subject_id: "+s_id+"\nSubject_name: "+s_name+" "+obj;
	}

}
