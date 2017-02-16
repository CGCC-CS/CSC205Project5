import cards.*;
import hands.*;

public class Activity5 {

	public static void main(String[] args) {
		Deck d = new Deck(52);
		HandOfCards hand = new ArrayHand(5);
		
		hand.addCard(d.dealOne());
		hand.addCard(d.dealOne());

		System.out.println("Hand :");
		hand.printHand();
	}
	
}
