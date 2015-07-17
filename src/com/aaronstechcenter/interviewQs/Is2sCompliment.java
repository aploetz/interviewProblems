package com.aaronstechcenter.interviewQs;

public class Is2sCompliment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int integer1 = 6;
		Boolean is2sCompliment1 = Utils.is2sCompliment(integer1);
		
		int integer2 = 16;
		Boolean is2sCompliment2 = Utils.is2sCompliment(integer2);
				
		System.out.println("And is " + integer1 + " a 2's compliment number? " + is2sCompliment1);
		System.out.println("And is " + integer2 + " a 2's compliment number? " + is2sCompliment2);

	}

}
