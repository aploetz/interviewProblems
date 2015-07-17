package com.aaronstechcenter.interviewQs;

public class Utils {

	//EASY
	public static boolean startsWithUpper(String input_) {
		Character first = input_.charAt(0);
		
		return Character.isUpperCase(first);
	}
	
	//EASY, without using built-in Character.isUpperCase function.
	public static boolean startsWithUpper2(String input_) {
		String first = input_.substring(0,1);
		
		return first.toUpperCase().equals(first);
	}
	
	//EASY, using the ASCII code range
	public static boolean startsWithUpper3(String input_) {
		Character first = input_.charAt(0);
		int asciiCode = (int)first;
		
		if (asciiCode >= 65 && asciiCode <= 90) {
			return true;
		} else {
			return false;
		}
	}
	
	//EASY
	public static String reverseAString(String input_) {
		String returnVal = "";
		
		for (int counterJ =  input_.length() - 1; counterJ >= 0; counterJ--) {
			returnVal += input_.charAt(counterJ);
		}
		
		return returnVal;
	}
	
	//EASY
	public static int sumAnArray(int[] listOfValues_) {
		int sum = 0;
		
		for (int counterJ = 0; counterJ < listOfValues_.length; counterJ++) {
			sum += listOfValues_[counterJ];
		}
		
		return sum;
	}
	
	//HARD
	public static int highestOrderBit(int _input) {
		int value = 0;
		double divisor = 0.5;
		
		if (_input == 0) {
			return 0;
		}
		
		while (value != 1) {
			divisor = divisor *2;
			value = _input / (int) divisor;
		}
		
		return (int) divisor;
	}
	
	public static boolean isBitFlipped(int _bit, int _input)
	{
		boolean returnVal = false;
		boolean first = true;
		int value = _input;
		int highBit = 0;
		
		while (first || highBit > _bit)
		{
			first = false;
			value = value - highBit;
			highBit = highestOrderBit(value);
		}
		
		if (highBit == _bit) {
			returnVal = true;
		}
		
		return returnVal;
	}
	
	//VERY HARD
	public static boolean is2sCompliment(int input_) {
		boolean returnVal = false;
		
		if (input_  == 2) {
			//is 2's compliment, return true
			returnVal = true;
		}
		else if (input_ % 2 != 0) {
			//if odd number, return false
			returnVal = false;
		} else {
			//even number, don't know if it's 2's compliment yet, call recursively with value of / 2
			returnVal = is2sCompliment(input_ / 2);
		}
		
		return returnVal;
	}
	
	public int bitValue(int _input, int _bit) {
		return _input & (1 << _bit);
	}
		
	public static int bitShift(int nValue, int xPower) {
		int answer = nValue << xPower;
		
		return answer;
	}
	
	public static Integer piFromSumOfSquaresAverage(int iterations) {
		Integer sum = 0;
		
		for (int intCounterJ = 1; intCounterJ <= iterations; intCounterJ++) {
			sum += iterations * iterations;
		}
		
		Integer returnVal = sum/iterations;
		
		return returnVal;
	}
	
	public static Double piFromWallis(int iterations)
	{
		Double returnVal = 0.0;
		
		for (int intCounterJ = 2; intCounterJ <= iterations; intCounterJ = intCounterJ + 2) {
			if (returnVal == 0) {
				returnVal = (double)(intCounterJ * intCounterJ) / (double)((intCounterJ - 1)*(intCounterJ + 1));
			} else {
				returnVal *= (double)(intCounterJ * intCounterJ) / (double)((intCounterJ - 1)*(intCounterJ + 1));
			}
		}
		
		return returnVal * 2;
	}
	
	// lifted from: http://www.math.hmc.edu/funfacts/ffiles/20010.5.shtml
	public static Double piFromNthDigits(int maxDigits)
	{
		Double returnVal = 0.0;
		StringBuilder strPi = new StringBuilder("3.");
		
		for (int intCounterJ = 1; intCounterJ <= maxDigits; intCounterJ++) {
			Integer digit = computePiDigit2(intCounterJ);
			strPi.append(digit);
		}
		
		returnVal = Double.parseDouble(strPi.toString());
		
		return returnVal;
	}
	
	private static Integer computePiDigit(int digit) {
		Double val = ((4/((8 * (double)digit) + 1)) - 
				(2/((8 * (double)digit) + 1)) - 
				(1/((8 * (double)digit) + 5)) - 
				(1/((8 * (double)digit) + 6)));
		
		return refineValue(val);
	}
	
	private static Integer computePiDigit2(int digit) {
		Double val = Math.pow(16.0, (double)digit * -1);
		
		return refineValue(val);		
	}
	
	private static Integer refineValue(Double val) {
		long rounded = Math.round(val * 200);
		
		if (rounded > 9) {
			return Integer.parseInt((rounded/10) + "");
		} else {
			return Integer.parseInt(rounded + "");
		}
	}
	
	private static String[] defineArray(String _val1, String _val2) {
		String[] nodes = {"192.168.1.10","192.168.1.12"};
		
		return nodes;
	}
	
}
