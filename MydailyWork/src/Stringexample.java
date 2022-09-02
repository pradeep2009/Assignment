import java.util.Arrays;

public class Stringexample {
	
	public void checkDigit(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(sum);
	}
	
	public void swapoddnumber(int a[])
	{
		int temp=0;
		int oddInd=1;
		int evenInd=0;
		while(true)
		{
			while(evenInd<a.length && a[evenInd]%2==0)
				evenInd+=2;
			while(oddInd<a.length && a[oddInd]%2==1)
				oddInd+=2;
			
				if(evenInd<a.length && oddInd<a.length)
				{
					temp=a[evenInd];
					a[evenInd]=a[oddInd];
					a[oddInd]=temp;
				}
				else
					break;
		}
		
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringexample e=new Stringexample();
		//String s="ada23a7a23d";
		int a[]= {3,6,12,1,5,8};
		//e.checkDigit(s);
		e.swapoddnumber(a);
	}

}
