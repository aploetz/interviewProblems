package com.aaronstechcenter.interviewQs;

public class BitShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nValue1 = 1;
		int xPower1 = 10;
		int nValue2 = 2;
		int xPower2 = 5;
		int nValue3 = 3;
		int xPower3 = 3;
		
		int answer1 = Utils.bitShift(nValue1, xPower1);
		int answer2 = Utils.bitShift(nValue2, xPower2);
		int answer3 = Utils.bitShift(nValue3, xPower3);
		
		System.out.println("A bit shift on " + nValue1 + " of " + xPower1 + " bits equals " + answer1);
		System.out.println("A bit shift on " + nValue2 + " of " + xPower2 + " bits equals " + answer2);
		System.out.println("A bit shift on " + nValue3 + " of " + xPower3 + " bits equals " + answer3);

	}

}
