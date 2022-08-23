package objectcontainment.com;

public class Address {
	 //String city,state,country;
    private String city,state,country;
	/*Address(String c,String s,String co)
	{
		city=c;
		state=s;
		country=co;
	}*/
    Address(){};
    public void setCity(String c)
    {
    	city=c;
    }
    public String getCity()
    {
    	return city;
    }
    public void setState(String s)
    {
    	state=s;
    }
    public String getState()
    {
    	return state;
    }
    public void setCountry(String co)
    {
    	country=co;
    }
    public String getCountry()
    {
    	return country;
    }
	/*public String toString()
	{
		return "\nCity:"+city+"\nState: "+state+"\nCountry: "+country;
	}*/
}
