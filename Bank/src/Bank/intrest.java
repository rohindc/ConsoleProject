package Bank;

@SuppressWarnings("static-access")
public class intrest {
	static int t, ti;
	static double r;
	static double finAmt;
	Account acc = new Account();

	public void simple_intrest() {
		if (acc.accType.equals("Saving"))
			r = 0.05;
		else
			r = 0.08;
		finAmt = acc.amt * (1 + (r * t));
		System.out.println("Simple intrest : " + Math.round(finAmt - acc.amt));
	}

	public void cmp_intrest() {
		finAmt = acc.amt * (Math.pow((1 + (r / 2)), (2 * t)));
		System.out.println("Compound intrest : " + Math.round(finAmt));
	}
}
