package objectcontainment.com;

public class Topic {
	
	private int t_id;
	private String t_name;
	private Subtopic obj;
	public void setT_id(int id)
	{
		t_id=id;
	}
	public int getT_id()
	{
		return t_id;
	}
	public void setT_name(String name)
	{
		t_name=name;
	}
	public String getT_name()
	{
		return t_name;
	}
	public void setObj(Subtopic obj)
	{
		this.obj=obj;
	}
	public Subtopic getObj()
	{
		return obj;
	}
	public String toString()
	{
		return "\nTopic id: "+t_id+"\nTopic name: "+t_name+"\n"+obj;
	}

}
