import cards.*;
import hands.HandOfCards;
import hands.HandOfTwo;

public class Activity5 {

	public static void main(String[] args) {
		Deck d = new Deck(52);
		HandOfCards hand = new HandOfTwo();
		
		hand.addCard(d.dealOne());
		hand.addCard(d.dealOne());

		System.out.println("Hand :");
		hand.printHand();
	}
	
}
