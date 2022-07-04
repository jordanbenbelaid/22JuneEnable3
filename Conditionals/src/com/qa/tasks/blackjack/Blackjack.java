package com.qa.tasks.blackjack;

public class Blackjack {

	public static void main(String[] args) {
		System.out.println(play(0, 0));

	}
	
	public static String play(int handOne, int handTwo) {
		
		if(handOne == handTwo) {
			return "Draw!";
		}else if(handOne < 0 || handTwo < 0) {
			return "Both players have a total below 0";
		} else if (handOne > 21 && handTwo > 21) {
			return "Both players have a total above 21";
		} else if (handOne > 21) {
			return "Player 2 wins!" + String.valueOf(handTwo);
		} else if (handTwo > 21) {
			return "Player 1 wins!" + String.valueOf(handOne);
		} else if (handOne > handTwo) {
			return "Player 1 wins!" + String.valueOf(handOne);
		} else {
			return "Player 2 wins!" + String.valueOf(handTwo);
		}
	}
	
	public static int play2(int handOne, int handTwo) {
		
		if(handOne == handTwo) {
			    return 0;
			}if (handOne < 0 || handTwo < 0) {
				return 0;
			} else if (handOne > 21 && handTwo > 21) {
				return 0;
			} else if (handOne > 21) {
				return handTwo;
			} else if (handTwo > 21) {
				return handOne;
			} else if (handOne > handTwo) {
				return handOne;
			} else {
				return handTwo;
			}

		} 

}
