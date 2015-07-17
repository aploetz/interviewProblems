package com.aaronstechcenter.interviewQs;

public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//for numbers 1-100
		String value = "";
		
		for (Integer counterJ = 1; counterJ <= 100; counterJ++) {
			if (counterJ % 3 == 0 && counterJ % 5 == 0) {
				//	print FizzBuzz if the number is divisible by 3 and 5
				value = "FizzBuzz";
			} else if (counterJ % 3 == 0) {
				//  print Fizz if the number is divisible by 3
				value = "Fizz";
			} else if (counterJ % 5 == 0) {
				//  print Buzz is the number is divisible by 5
				value = "Buzz";
			} else {
				//  print the number if it is divisible by neither 3 nor 5
				value = counterJ.toString();
			}
		
			System.out.println(value);
		}
	}

}
