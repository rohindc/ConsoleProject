package sifiCalculator;

public class SipCal {
	private double p = 0.0;
    private double r = 0.0;
    private int fv = 0;
    private int t = 0;
    private int n = 0;
    
	public void setP(double p) {
		this.p = p;
	}
	public void setAr(double r) {
		r = r /100.0;
		this.r = r;
	}
	public void setT(int t) {
		this.t = t;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int answer() {
				fv = (int) (p * (Math.pow(1 + r/n,n* t)));
		return fv;
	}
}
