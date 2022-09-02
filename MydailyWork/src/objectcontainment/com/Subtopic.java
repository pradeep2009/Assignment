package objectcontainment.com;

public class Subtopic {
	
	private int s_id;
	private String s_name;
	private Question obj;
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
	public void setObj(Question obj)
	{
		this.obj=obj;
	}
	public Question getObj()
	{
		return obj;
	}
	public String toString()
	{
		 return "Subtopic id: "+s_id+"\nSubtopic name: "+s_name+"\n"+obj;
	}

}
