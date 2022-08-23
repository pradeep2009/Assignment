package wrapping.com;

import wrapping.com.Bank.Locker;



public class InnerClas {

	public static void main(String[] args) {
		Bank b=new Bank("BANK OF BARODA", "BARBOVADAHM");
		Bank.Locker l=b.new Locker(424,"vadala");
		l.lockerInfo();

	}

}
