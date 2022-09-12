package string.com;

import java.util.Scanner;

class ItemStockUnderFlowException extends Exception
{
	public String underFlow()
	{
		return "item stock under flow";
	}
}
class ItemStockOverFlowException extends Exception
{
	public String overFlow()
	{
		return "item stock over flow";
	}
}

public class Store {
	
 int noOfItemsAvailale;
  int maximumLevel,minimumLevel;
	 Store(){}
	public Store(int x,int y,int z) {
		noOfItemsAvailale=x;
		maximumLevel=y;
		minimumLevel=z;
	}
	 public void addItem(int x) throws ItemStockOverFlowException
	 {
		if(noOfItemsAvailale+x>=maximumLevel) 
		{
			throw new ItemStockOverFlowException();
		}
		noOfItemsAvailale+=x;
	 }
	 public void removeItem(int y) throws ItemStockUnderFlowException
	 {
		 if(noOfItemsAvailale+y<=minimumLevel) 
			{
				throw new ItemStockUnderFlowException();
			}
			noOfItemsAvailale-=y;
			checkStock();
			System.out.println("update stoc is"+noOfItemsAvailale);
			
	 }
	 public int checkStock()
	 {
		// return noOfItemAvailable;
	 }
	 

	public static void main(String[] ar) {
		 
		 Store s=new Store(400,700,700);
		 try {
			s.addItem(200);
			s.removeItem(300);
		} 
		 catch (ItemStockOverFlowException e) 
		 {
			
			System.out.println(e.overFlow());
		}
		catch (ItemStockUnderFlowException e) 
		 {
			
			System.out.println(e.underFlow());
		}
		 
	}

}
