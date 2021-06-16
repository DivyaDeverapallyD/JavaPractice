package junitpractice;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;



public class Cards{
    public static void main(String[] args)
    {
        System.out.println("Haiiiiii Divyaaaaaaaaaaa");
        PokerHandCategories pokerHandRanking= new PokerHandCategories();

       // Card card=new Card("A","Club");
      
      //  pokerHandRanking.cardData(card);


        String[] suits = { "Diamonds", "Clubs", "Spades", "Hearts" };
        String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        final int DECK_SIZE = 52;

        // Card[] deckOfCards= new Card[DECK_SIZE];
        List<Card> deckOfCards = new ArrayList<>();
        int index = 0;
        for (int rank = 0; rank < ranks.length; rank++) {
            for (int suit = 0; suit < suits.length; suit++) {
                deckOfCards.add(index, new Card(ranks[rank], suits[suit]));
                index++;

            }
        }

        /*
         * System.out.println("Before Shuffling ");
         *
         * for (Card card : deckOfCards) System.out.println(card.rank + "-----" +
         * card.suit); // cards Shuffling
         * System.out.println("************************************************");
         */
        for (int i = 0; i < deckOfCards.size(); i++) {
            /*
             * int min = 1, max = 52, range = max - min + 1; int r = (int) (Math.random() *
             * range) + min;
             */
            Random rand = new Random();
            int r = i + rand.nextInt(52 - i);
            Card temp = deckOfCards.get(r);
            deckOfCards.set(r, deckOfCards.get(i));
            deckOfCards.set(i, temp);

        }
		/*System.out.println("\u2660"); // Spade
		System.out.println("\u2663");// Club
		System.out.println("\u2665");// Heart
		System.out.println("\u2666");// Diamond
*/

        System.out.println("Shuffling..... Shuffling.... Shuffling....." + "\n");
        /*
         * for (Card card : deckOfCards) System.out.println(card.rank + "-----" +
         * card.suit);
         * System.out.println("************************************************");
         */

        List<Card> pokerHand = new ArrayList<Card>();
        for (int i = 0; i < 5; i++) {
            pokerHand.add(deckOfCards.get(i));
        }
        System.out.print("Your hand : ");

        for (Card card : pokerHand) {
            if (card.suit.equals("Spades"))
                System.out.print(card.rank + "" + "\u2660" + "\t");
            if (card.suit.equals("Clubs"))
                System.out.print(card.rank + "" + "\u2663" + "\t");
            if (card.suit.equals("Hearts"))
                System.out.print(card.rank + "" + "\u2665" + "\t");
            if (card.suit.equals("Diamonds"))
                System.out.print(card.rank + "" + "\u2666" + "\t");
        }
        System.out.println("\n");

        System.out.print("You have : ");
        List<Card> tempPokerHand = new ArrayList<Card>();
        PokerHandCategories handRanking = new PokerHandCategories(suits, ranks);
        
        tempPokerHand.add(new Card("J","Diamond"));
        tempPokerHand.add(new Card("10","Club"));
        tempPokerHand.add(new Card("9","Spade"));
        tempPokerHand.add(new Card("8","Heart"));	
        tempPokerHand.add(new Card("7","Club"));
		//assertTrue(pokerHandRanking.isStraight(pokerHand));
        if(handRanking.isStraight(tempPokerHand))
           System.out.println("Result is " +  handRanking.isStraight(tempPokerHand));

        
       /* if (handRanking.isStraightFlush(pokerHand))
            System.out.println(" Straight Flush");
        else if (handRanking.isFourOfAKind(pokerHand))
            System.out.println("Four of a Kind");
        else if (handRanking.isFullHouse(pokerHand))
            System.out.println("Full House");
        else if (handRanking.isFlush(pokerHand))
            System.out.println("Flush");
        else if (handRanking.isStraight(pokerHand))
            System.out.println("Straight");
        else if (handRanking.isThreeOfAKind(pokerHand))
            System.out.println("Three of a Kind");
        else if (handRanking.isTwoPair(pokerHand))
            System.out.println("Two Pair");
        else if (handRanking.isOnePair(pokerHand))
            System.out.println("One Pair");
        else
            System.out.println("High Cards");*/



    }
}