package inheritance.com;

class Mobile
 {
    String color;
    int model_no;
    Mobile()
    {
    	color="red";
    	model_no=154;
    }
    Mobile(int mno)
    {
    	model_no=mno;
    	System.out.println("Parametersized constructor");
    }
   /* public void call()
    {
    	System.out.println("Using for the calling purpose");
    }*/
}
class Samsung extends Mobile
{
	String box;
	float price;
	Samsung()
	{
		super(450);
		System.out.println("model no: "+model_no);
		price=14000f;
	}
	public void purchase()
	{
		
		System.out.println("this is the price: "+price);
	}
}
class Nokia extends Mobile
{
	String type;
	float price;
	Nokia()
	{
	    super();
		type="Android";
		price=15000f;
		System.out.println("color of mobile: "+color);
		System.out.println("model no: "+model_no);
		
	}
	public void purchase()
	{
		
		System.out.println("this is the price: "+price);
	}
	public void typeOfMobile()
	{
		System.out.println("Type: "+type);
	}
}