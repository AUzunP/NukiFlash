package card;

import java.util.ArrayList;

public class CardDictionary {

	public static ArrayList<Card> cardsList = new ArrayList<Card>();
	
	public CardDictionary() {
		
		populateDictionary();
		
	}
	
	private static void populateDictionary() {
		
		Card card1 = new Card("Powerhouse of the cell", "Mitochondria");
		Card card2 = new Card("protein stuff made where", "ribosomes");
		
		addToDictionary(card1);
		addToDictionary(card2);
		
	}

	public static boolean searchDictionary() {
		
		return true;
	}
	
	
	public static void addToDictionary(Card card) {
		
		cardsList.add(card);
	}
	
	public void removeFromDictionary() {
		
		
	}
	
}
