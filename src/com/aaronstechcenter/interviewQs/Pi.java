package com.aaronstechcenter.interviewQs;

public class Pi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int iterations1 = 119;
		int iterations2 = 60000;
		int digits1 = 10;
		Integer computePi1 = Utils.piFromSumOfSquaresAverage(iterations1);
		Double computePi2 = Utils.piFromWallis(iterations2);
		Double computePi3 = Utils.piFromNthDigits(digits1);
		
		System.out.println("                                           Java says Pi = " + Math.PI);
		System.out.println("Computing Pi from avg sum of squares for " + iterations1 + " iterations = 3." + computePi1);
		System.out.println("Computing Pi from Wallis' Forumula for " + iterations2 + " iterations = " + computePi2);
		System.out.println("             Computing Pi from Nth digits for " + digits1 + " digits = " + computePi3);
		
	}

}
