/**

 * 
 */
package junitpractice;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


/**
 * @author Divya Deverapally
 *
 *
 */
class PokerHandTesting {

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#PokerHandCategories(java.lang.String[], java.lang.String[])}.
	 */
	String[] suits = { "Diamonds", "Clubs", "Spades", "Hearts" };
	String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	
	PokerHandCategories pokerHandCategories= new PokerHandCategories();
	

	// Card[] deckOfCards= new Card[DECK_SIZE];


	@Test
	void testPokerHandCategories() {
		
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isStraightFlush(java.util.List)}.
	 */
	@Test
	void testIsStraightFlush() {
		
		
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isFourOfAKind(java.util.List)}.
	 */
	@Test
	void testIsFourOfAKind() {
		List<Card> pokerHand = new ArrayList<Card>();
		pokerHand.add(new Card("A","Club"));
		pokerHand.add(new Card("A","Club"));
		pokerHand.add(new Card("4","Club"));
		pokerHand.add(new Card("A","Club"));	
		pokerHand.add(new Card("A","Club"));
		assertTrue(pokerHandCategories.isFourOfAKind(pokerHand));
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isFullHouse(java.util.List)}.
	 */
	@Test
	void testIsFullHouse() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isFlush(java.util.List)}.
	 */
	@Test
	void testIsFlush() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isStraight(java.util.List)}.
	 */
	@Test
	void testIsStraight() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isThreeOfAKind(java.util.List)}.
	 */
	@Test
	void testIsThreeOfAKind() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isTwoPair(java.util.List)}.
	 */
	@Test
	void testIsTwoPair() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isOnePair(java.util.List)}.
	 */
	@Test
	void testIsOnePair() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link junitpractice.PokerHandCategories#isHighCards(java.util.List)}.
	 */
	@Test
	void testIsHighCards() {
		fail("Not yet implemented");
	}

}
