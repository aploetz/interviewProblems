package com.aaronstechcenter.interviewQs;

public class StartsWithUppercase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Aaron";
		String last = "Ploetz";
		String is = "is";
		String awesome = "awesome!";
		String cassandra = "Cassandra";
		String rocks = "rocks!";
		
		Boolean nameUpper = Utils.startsWithUpper(name); 
		Boolean lastUpper = Utils.startsWithUpper2(last); 
		Boolean isUpper = Utils.startsWithUpper(is);
		Boolean awesomeUpper = Utils.startsWithUpper2(awesome);
		Boolean cassandraUpper = Utils.startsWithUpper3(cassandra);
		Boolean rocksUpper = Utils.startsWithUpper3(rocks);
		
		System.out.println("Is the first char of " + name + " upper?  " + nameUpper.toString());
		System.out.println("Is the first char of " + last + " upper?  " + lastUpper.toString());
		System.out.println("Is the first char of " + is + " upper?  " + isUpper.toString());
		System.out.println("Is the first char of " + awesome + " upper?  " + awesomeUpper.toString());
		System.out.println("Is the first char of " + cassandra + " upper?  " + cassandraUpper.toString());
		System.out.println("Is the first char of " + rocks + " upper?  " + rocksUpper.toString());

	}

}
