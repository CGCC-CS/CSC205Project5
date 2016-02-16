package hands;

import cards.PlayingCard;

public class ArrayHand implements HandOfCards {

	private PlayingCard hand[];
	private int count;
	
	public void ArrayHand () {
		this.ArrayHand(2);
	}
	
	public void ArrayHand (int length) {
		hand = new PlayingCard[length];
		hand[0] = null;
		hand[1] = null;
		count = 0;
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
