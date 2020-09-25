package model;

public class CalculateSimpleInterest {
	//Ruth McGee
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
