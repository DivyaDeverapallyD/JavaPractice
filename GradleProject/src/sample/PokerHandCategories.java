/**
 * 
 */
package sample;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Divya Deverapally
 *
 *
 */
public class PokerHandCategories {

	String[] suits = new String[4];
	String[] ranks = new String[13];

	Map<String, Integer> ranksMap = new HashMap<>();

	/**
	 * 
	 */
	
	public PokerHandCategories(String[] suits, String[] ranks) {
		// TODO Auto-generated constructor stub
		this.suits = suits;
		this.ranks = ranks;
		for (int rank = 0; rank < 13; rank++) {
			ranksMap.put(ranks[rank], rank + 1);
		}
	}

	// 5 cards of same suit and sequential order
	boolean isStraightFlush(List<Card> hand) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (Card card : hand) {
			map.put(card.rank, ranksMap.get(card.rank));
		}

		if (isFlush(hand)) // same suit condition
		{
			// List<String> indexes = new ArrayList<String>(map.keySet()); // <== Parse

			Object[] rankValues = map.values().toArray();
			int firstNum = (int) rankValues[0];

			for (int i = 0; i < rankValues.length - 1; i++) {
				// int a=(int) rankValues[i];
				// int b =(int) rankValues[i + 1];
				if ((int) rankValues[i] - (int) rankValues[i + 1] != 1) {
					return false;
				}
			}

			return true;

		}
		return false;

	}

	// 4 cards of one Rank and 1 card of another Rank
	boolean isFourOfAKind(List<Card> hand) {
		int count = 0;

		Map<String, Integer> rankCount = new HashMap<>();

		for (Card card : hand) {
			if (rankCount.containsKey(card.rank))
				rankCount.put(card.rank, rankCount.get(card.rank) + 1);
			else
				rankCount.put(card.rank, 1);

		}

		/*
		 * for(Entry<String, Integer> entry : rankCount.entrySet()) {
		 * System.out.println(entry.getKey()+"*****"+ entry.getValue()); }
		 */

		Collection<Integer> values = rankCount.values();

		// Collection<Integer> valuess=rankCount.values();
		int max = Collections.max(values);
		// System.out.println(max);
		if (max == 4)
			return true;

		else

			return false;

	}

	// 3 cards of one rank and 2 cards of another rank(Same)
	// check the conditon again
	boolean isFullHouse(List<Card> hand) {
		Map<String, Integer> rankCount = new HashMap<>();
		for (Card card : hand) {
			if (rankCount.containsKey(card.rank))
				rankCount.put(card.rank, rankCount.get(card.rank) + 1);
			else
				rankCount.put(card.rank, 1);

		}
		Object[] ll = rankCount.values().toArray();
		if (ll.length == 2) {

			if (((int) ll[0] == 3 && (int) ll[1] == 2) || ((int) ll[0] == 2 && (int) ll[1] == 3))
				return true;

		}

		return false;

	}

	// 5 cards are of same suit
	// Can modify better
	boolean isFlush(List<Card> hand) {

		int count = 1;
		String s = hand.get(0).suit;

		for (int i = 1; i < hand.size(); i++) {
			if (hand.get(i).suit.equals(s))
				count++;
		}

		if (count == 5)
			return true;
		else
			return false;

	}

	// 5 Cards of Sequential Order , Not all of the same suit
	boolean isStraight(List<Card> hand) {

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (Card card : hand) {
			map.put(card.rank, ranksMap.get(card.rank));
		}

		if (!isFlush(hand)) // same suit condition
		{
			// List<String> indexes = new ArrayList<String>(map.keySet()); // <== Parse

			Object[] rankValues = map.values().toArray();
			//// int firstNum = (int) rankValues[0];

			for (int i = 0; i < rankValues.length - 1; i++) {
				if ((int) rankValues[i] - (int) rankValues[i + 1] != 1) {
					return false;
				}
			}

			return true;

		}
		return false;

	}

	// 3 Cards of one Rank and 2 cards of other ranks(Different ranks)
	boolean isThreeOfAKind(List<Card> hand) {

		Map<String, Integer> rankCount = new HashMap<>();
		for (Card card : hand) {
			if (rankCount.containsKey(card.rank))
				rankCount.put(card.rank, rankCount.get(card.rank) + 1);
			else
				rankCount.put(card.rank, 1);

		}
		Object[] ll = rankCount.values().toArray();
		int maxRankCount = Collections.max(rankCount.values());

		if (maxRankCount == 3 && !isFullHouse(hand)) {
			return true;
		}
		return false;

	}

	// 2 cards of one rank,other 2 cards of 1 rank and i card of other rank

	boolean isTwoPair(List<Card> hand) {
		Map<String, Integer> rankCount = new HashMap<>();
		for (Card card : hand) {
			if (rankCount.containsKey(card.rank))
				rankCount.put(card.rank, rankCount.get(card.rank) + 1);
			else
				rankCount.put(card.rank, 1);

		}

		Object[] ll = rankCount.values().toArray();
		Arrays.sort(ll);

		// if()
		int c = 0;
		for (int k = 0; k < ll.length; k++) {
			if ((int) ll[k] == 2)
				c++;
		}

		if (c == 2)
			return true;

		// Collections.sort(rankCount.values().toArray());
		return false;

	}

	// 2 cards of same rank and 3 cards of different ranks

	boolean isOnePair(List<Card> hand) {

		Map<String, Integer> rankCount = new HashMap<>();
		for (Card card : hand) {
			if (rankCount.containsKey(card.rank))
				rankCount.put(card.rank, rankCount.get(card.rank) + 1);
			else
				rankCount.put(card.rank, 1);

		}

		Object[] ll = rankCount.values().toArray();
		Arrays.sort(ll);

		// if()
		int c = 0;
		if (ll.length == 4) {
			for (int k = 0; k < ll.length; k++) {
				if ((int) ll[k] == 2)
					c++;
			}
		}

		if (c == 1)
			return true;

		// Collections.sort(rankCount.values().toArray());
		return false;

		// return false;

	}

	boolean isHighCards(List<Card> hand) {
		return false;
	}

}
