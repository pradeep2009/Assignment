package objectcontainment.com;

public class Question {
	
	private int q_id;
	private String q_name;
	public void setQ_id(int id)
	{
		q_id=id;
	}
	public int getQ_id()
	{
		return q_id;
	}
	public void setQ_name(String name)
	{
		q_name=name;
	}
	public String getQ_name()
	{
		return q_name;
	}
	public String toString()
	{
		 return "Question id: "+q_id+"\nQuestion name: "+q_name;
	}

}
