import cards.*;
import hands.*;

public class Activity5 {

	public static void main(String[] args) {
		Deck d = new Deck(52);
		HandOfCards hand = new ArrayHand();
		
		hand.add(d.dealOne());
		hand.add(d.dealOne());

		System.out.println("Hand :");
		hand.print();
	}
	
}
