package com.aaronstechcenter.interviewQs;

public class HighestOrderBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int integer1 = 6;
		int highBit1 = Utils.highestOrderBit(integer1);
		
		int integer2 = 7;
		int highBit2 = Utils.highestOrderBit(integer2);
				
		System.out.println("Highest order bit of " + integer1 + " is " + highBit1);
		System.out.println("Highest order bit of " + integer2 + " is " + highBit2);

	}

}
