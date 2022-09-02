package com.pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int i,j,n=4;
		
		for(i=1;i<=n;i++)
		{
			int num;
			if(i%2==0)
			{
				num=0;
				for(j=1;j<=n;j++)
				{
				  System.out.print(num);
                  
                  num = (num == 0)? 1 : 0;
				}
			 }
				else
				{
					num=1;
					 for(j=1;j<=n;j++)
					   {
						  System.out.print(num);
		                  
		                  num = (num == 1)? 0: 1;
					   }	
				}
				
			System.out.println();
				
			}
			
	    	
		}

	}


