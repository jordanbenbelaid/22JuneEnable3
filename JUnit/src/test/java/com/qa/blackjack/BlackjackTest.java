package com.qa.blackjack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BlackjackTest {
	
	Blackjack tryMe = new Blackjack();

	@Test
	public void handOneHandTwoZero() {
		int a = 15;
		int b = 15;
		
		assertEquals(0, tryMe.play(a, b));
	}
	
	@Test
	public void lessThanZeroHand() {
		int a = -2;
		int b = 12;
		
		assertEquals(0, tryMe.play(a, b));
	}
	
	@Test
	public void over21Test() {
		int a = 22;
		int b = 23;
		
		assertEquals(0, tryMe.play(a, b));
	}
	
	@Test
	public void handTwoWinsOver21() {
		int a = 22;
		int b = 18;
		
		assertEquals(b, tryMe.play(a, b));
	}
	
	@Test
	public void handOneWinsOver21() {
		int a = 18;
		int b = 22;
		
		assertEquals(18, tryMe.play(a, b));
	}
	
	@Test 
	public void handOneWins() {
		int a = 20;
		int b = 16;
		
		assertEquals(20, tryMe.play(a, b));
	}
	
	@Test 
	public void handTwoWins() {
		int a = 16;
		int b = 20;
		
		assertEquals(20, tryMe.play(a, b));
	}
}
