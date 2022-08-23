package objectcontainment.com;

public class Institute {

	private int i_id;
	private String i_name;
	private Branch obj;
	public void setI_id(int id)
	{
		i_id=id;
	}
	public int getI_id()
	{
		return i_id;
	}
	public void setI_name(String name)
	{
		i_name=name;
	}
	public String getI_name()
	{
		return i_name;
	}
	public void setObj(Branch obj)
	{
		this.obj=obj;
	}
	public Branch getObj()
	{
		return obj;
	}
	public String toString()
	{
		return "\nInstitute Id: "+i_id+"\nInstitute Name: "+i_name+"\n"+obj;
	}
}
