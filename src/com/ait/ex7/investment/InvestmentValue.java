package com.ait.ex7.investment;

public class InvestmentValue {
	private final static double RATE1=0.02;
	private final static double RATE2=0.05;
	private final static double RATE3=0.07;
	
	public static double calculateInvestmentValue(int term, int startAmount){
		double finalAmount=0;
		
		if (term < 3) {
			throw new IllegalArgumentException(
					"illegal investment period: [" + term + "] + min value: 3 years");
		} else if (term > 10) {
			throw new IllegalArgumentException(
					"illegal investment period: [" + term + "] + max value: 10 years");
		}
		
		if (startAmount < 1000) {
			throw new IllegalArgumentException(
					"illegal minimum investment: [" + startAmount + "] min value: 1000");
		} else if (startAmount > 10000) {
			throw new IllegalArgumentException(
					"illegal maximum investment: [" + startAmount + "] max value: 10000");
		}
		
		double rate=getRate(startAmount);
		
		finalAmount=startAmount;
		for (int i=1;i<=term;i++){
			finalAmount=finalAmount*(1+rate);
		}
		return finalAmount;
	}
	
	private static double getRate(double startAmount){
		double rate;
		if (startAmount<2999){
			rate=RATE1;
		}
		else if(startAmount<5000){
			rate=RATE2;
		}
		else{
			rate=RATE3;
		}
		return rate;
	}
}
