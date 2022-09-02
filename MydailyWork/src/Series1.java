
public class Series1 {

	public static void main(String[] args) {
		int pr=0;
		for(int i=1;i<=7;i++)
		{
			pr=(pr*2)+1;
			System.out.print(pr+" ");
		}
		System.out.println();
		int prev=2;
		System.out.print(prev+" ");
		for(int i=2;i<=8;i++)
		{
		  prev=(2*prev)-1;
		  System.out.print(prev+" ");
		}
	}

}
