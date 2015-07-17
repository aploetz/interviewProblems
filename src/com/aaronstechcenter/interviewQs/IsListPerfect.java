package com.aaronstechcenter.interviewQs;

import java.util.List;

import com.betterProgrammer.*;

public class IsListPerfect {

	public static void main(String[] args) {
		List<Integer> perfectList = BetterProgrammerTask.getPerfectNumbers(1,  10);
		
		for (Integer num : perfectList) {
			System.out.println(num);
		}
	}

}
