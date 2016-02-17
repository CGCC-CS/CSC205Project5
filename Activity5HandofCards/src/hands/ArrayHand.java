package hands;

import cards.PlayingCard;

public class ArrayHand implements HandOfCards {

	private PlayingCard hand[];
	private int count;
	
	public ArrayHand () {
		this(2);
	}
	
	public ArrayHand (int length) {
		count = length;
		hand = new PlayingCard[count];
		for (int ii=0;ii<count;ii++)
			hand[ii] = null;
	}
	
	@Override
	public void addCard(PlayingCard c) {
		if (count < hand.length) {
			hand[count] = c;
		}
	}

	@Override
	public void printHand() {
		for (int ii=0; ii<hand.length; ii++) {
			System.out.println("Card " + ii + ": " + hand[ii]);
		}
	}
}
