package com.day27;

import java.util.HashMap;

public class HackathonScoreCalculator {

	public static void main(String[] args) {

		String erica = "HHM";
		String bob = "MHE";
		
		String erica1 = "EHE";
		String bob1 = "MHE";
		
		String erica2 = "EHM";
		String bob2 = "MHE";
		
		hackerRankResult(erica, bob);
		hackerRankResult(erica1, bob1);
		hackerRankResult(erica2, bob2);
		
		
	}

	private static void hackerRankResult(String erica, String bob) {
		if(erica.length()!=bob.length()) {
			System.err.println("Length of both string should be same");
			System.exit(0);
		}
		
		HashMap<Character, Integer> scoreCard = new HashMap<Character, Integer>();
		scoreCard.put('E', 1);
		scoreCard.put('M', 3);
		scoreCard.put('H', 5);
		
		int erica_final_score =0;
		int bob_final_score =0;
		
		for(int i=0; i<erica.length();i++) {
			erica_final_score = erica_final_score+scoreCard.get(erica.charAt(i));
			bob_final_score = bob_final_score+scoreCard.get(bob.charAt(i));
		}
		
		if(erica_final_score>bob_final_score) {
			System.out.println("Winner is Erica : "+erica_final_score);
		} else if(erica_final_score<bob_final_score) {
			System.out.println("Winner is Bob : "+bob_final_score);
		} else if (erica_final_score == bob_final_score) {
			System.out.println("Scores are Tie");
		}
	}

}
