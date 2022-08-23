package wrapping.com;

public class Enumstudy {

	public static void main(String[] args) {
		
		Weekdays w=Weekdays.TUESDAY;
		switch(w)
		{
		case MONDAY:	
		case TUESDAY:	
		case WEDNESDAY:	
		case THURSDAY:	
		case FRIDAY:
			System.out.println("This is week day..");
			break;
		default:
			System.out.println("This is holiday...");
		}

	}

}
