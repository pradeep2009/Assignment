package objectcontainment.com;

public class Shop {
	
	private int shop_id;
	private String shop_name;
	private String shop_area;
	Shop(){
		
	}
	Shop(int id,String sname,String sarea)
	{
		shop_id=id;
		shop_name=sname;
		shop_area=sarea;
	}
	public void setShop_id(int id)
	{
		shop_id=id;
	}
	public void setShop_name(String s)
	{
		shop_name=s;
	}
	public void setShop_area(String s1)
	{
		shop_area=s1;
	}
	public int getShop_id()
	{
		return shop_id;
	}
	public String getShop_name()
	{
		return shop_name;
	}
	public String getShop_area()
	{
		return shop_area;
	}
	public String toString()
	{
		return "Shop id: "+shop_id+"\nShop Name:"+shop_name+"\nShop Area: "+shop_area;
	}

}
