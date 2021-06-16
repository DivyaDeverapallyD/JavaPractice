/**
 * 
 */
package poker.assessment;

/**
 * @author Divya Deverapally
 *
 *
 */
public class Deck {
	
	public static void main(String...  args) {
		String[] suits= {"Diamonds","Clubs","Spades","Hearts"};
		String[] ranks= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		final int DECK_SIZE=52;
		
		String[] deckOfCards= new String[DECK_SIZE];
		
		for(int rank=0;rank<ranks.length;rank++)
		{
			for(int suit=0;suit<suits.length;suit++)
			{
				deckOfCards[rank*suits.length+suit]=ranks[rank]+"->"+suits[suit];
				
			}
		}
		
		for(int i=0;i<DECK_SIZE;i++)
			System.out.println(deckOfCards[i]);
		
	}
	
}
