package objectcontainment.com;

public class Market {
	
	private String market_name;
   private  int market_id;
	private String market_area;
	private Shop obj;
	Market()
	{
		
	}
	Market(String mname,int mid,String marea,Shop o)
	{
		market_name=mname;
		market_id=mid;
		market_area=marea;
		obj=o;
		
	}
	/*Market(String mname,int mid,String marea)
	{
		market_name=mname;
		market_id=mid;
		market_area=marea;
		obj4=new Shop(666,"sanket","katraj");
		
	}*/
	public void setMarket_name(String s)
	{
		market_name=s;
	}
	public void setMarket_id(int id)
	{
		market_id=id;
	}
	public void setMarket_area(String s1)
	{
		market_area=s1;
	}
	
	public void setObj(Shop s)
	{
		obj=s;
	}
	
	public Shop getObj()
	{
		return obj;
	}
	
	public String toString()
	{
		return "Market Name:"+market_name+" Market id: "+market_id+" Market area "+market_area+"\n"+obj;
	}
  
}
