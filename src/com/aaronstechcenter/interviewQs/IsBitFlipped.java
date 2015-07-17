package com.aaronstechcenter.interviewQs;

public class IsBitFlipped {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int bit = 2;
		
		int integer1 = 7; 
		boolean answer1 = Utils.isBitFlipped(bit,integer1);

		int integer2 = 6; 
		boolean answer2 = Utils.isBitFlipped(bit,integer2);

		int integer3 = 5; 
		boolean answer3 = Utils.isBitFlipped(bit,integer3);

		int integer4 = 4; 
		boolean answer4 = Utils.isBitFlipped(bit,integer4);

		int integer5 = 3; 
		boolean answer5 = Utils.isBitFlipped(bit,integer5);

		int integer6 = 2; 
		boolean answer6 = Utils.isBitFlipped(bit,integer6);

		int integer7 = 1; 
		boolean answer7 = Utils.isBitFlipped(bit,integer7);

		System.out.println("Is the " + bit + " bit flipped on " + integer1 + "? " + answer1);
		System.out.println("Is the " + bit + " bit flipped on " + integer2 + "? " + answer2);
		System.out.println("Is the " + bit + " bit flipped on " + integer3 + "? " + answer3);
		System.out.println("Is the " + bit + " bit flipped on " + integer4 + "? " + answer4);
		System.out.println("Is the " + bit + " bit flipped on " + integer5 + "? " + answer5);
		System.out.println("Is the " + bit + " bit flipped on " + integer6 + "? " + answer6);
		System.out.println("Is the " + bit + " bit flipped on " + integer7 + "? " + answer7);
	}

}
