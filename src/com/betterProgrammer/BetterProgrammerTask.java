package com.betterProgrammer;

import java.util.ArrayList;
import java.util.List;

public class BetterProgrammerTask {

    public static boolean isPalindrome(String s) {
        /*
          Definition: A palindrome is a string that reads the same forward and backward.
          For example, "abcba" is a palindrome, "abab" is not.
          Please implement this method to
          return true if the parameter is a palindrome and false otherwise.
         */
    	
    	int length = s.length();
    	
    	for (int counterJ = 0; counterJ < length / 2; counterJ++) {
    		Character first = s.charAt(counterJ);
    		Character second = s.charAt((length - 1) - counterJ);
    		
    		if (!first.equals(second)) {
    			return false;
    		}
    		
    	}
    	
    	return true;
    }
    
    public static List<Integer> getPerfectNumbers(int from, int to) {
    	//perfect num is a number equal to the sum of its divisors
    	// 6 = 3 + 2 + 1
    	List<Integer> returnVal = new ArrayList<Integer>();
    	
    	for (Integer counterJ = from; counterJ <= to; counterJ++) {
    		if (isPerfect(counterJ)) {
    			returnVal.add(counterJ);
    		}
    	}
    	
    	return returnVal;
    }
    
    private static boolean isPerfect(Integer x_) {
    	List<Integer> divisors = new ArrayList<Integer>();
    	
    	for (Integer counterJ = 1; counterJ < x_; counterJ++) {
    		if (x_ % counterJ == 0) {
    			divisors.add(counterJ);
    		}
    	}
    	
    	//sum divisors
		Integer sum = 0;
		
		for (Integer divisor : divisors) {
			sum += divisor;
		}
		
		if (sum == x_) {
			return true;
		} else {
			return false;
		}
    }
    
    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public static List<Node> traverseTreeInWidth(Node root) {
        /*
          Please implement this method to
          traverse the tree in width and return a list of all passed nodes.

          The list should start with the root node, next
          it should contain all second-level nodes, then third-level nodes etc.

          The method shall work optimally with large trees.
         */
    	List<Node> nodesPassed = new ArrayList<Node>();
    	
    	Node currentNode = root;
    	List<Node> layer = currentNode.getChildren();

    	while (layer != null && layer.size() > 0) {
    		nodesPassed.addAll(layer);

    		List<Node> nextLayer = new ArrayList<Node>();
    		
    		for (Node node : layer) {
    			nextLayer.addAll(node.getChildren());
    		}
    		
    		layer = nextLayer;
    	}
    
    	return nodesPassed;
    }
    
    public static List<Integer> getReversalsToSort(int[] a) {
        /*
         You need to sort an array of integers by repeatedly reversing
         the order of the first several elements of it.

         For example, to sort [12,13,11,14], you need to  reverse the order of the first two (2)
         elements and get [13,12,11,14] and then reverse the order of the first three (3)
         elements and get [11,12,13,14]

         The method should return the shortest(!) possible list of integers corresponding to the required reversals.
         For the previous example, given an array [12,13,11,14]
         the method should return a list with Integers 2 and 3.
        */
    	List<Integer> returnVal = new ArrayList<Integer>();
    	
    	return returnVal;
    }
}
