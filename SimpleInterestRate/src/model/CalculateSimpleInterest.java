package model;

public class CalculateSimpleInterest {
	//Ruth McGee
	private double principalAmt;
	private double annualInterestRatePrcnt;
	private int yearsCount;
	
	// constructor
	public CalculateSimpleInterest(double prin, double apr, int yrCt) {
		super();
		this.principalAmt = prin;
		this.annualInterestRatePrcnt = apr;
		this.yearsCount = yrCt;
	}
	
	public double returnAmountEarned() {
		double amtEarned = ((this.annualInterestRatePrcnt / 100) * this.principalAmt * this.yearsCount);
		return amtEarned;
	}
	
	
	//getters and setters
	public double getprincipalAmt() {
		return this.principalAmt;
	}
	public void setprincipalAmt (double principalAmt) {
		this.principalAmt = principalAmt;
	}
	public double getAnnualInterestRatePrcnt() {
		return this.annualInterestRatePrcnt;
	}
	public void setAnnualInterestRatePrcnt(double annualInterestRatePrcnt) {
		this.annualInterestRatePrcnt = annualInterestRatePrcnt;
	}
	public int getYearsCount() {
		return this.yearsCount;
	}
	public void setYearsCount(int yearsCount) {
		this.yearsCount = yearsCount;
	}

	@Override
	public String toString() {
		return "CalculateSimpleInterest [principalAmt=" + principalAmt + ", annualInterestRatePrcnt="
				+ annualInterestRatePrcnt + ", yearsCount=" + yearsCount + "]";
	}
	
	
	

}
