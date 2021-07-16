package BlackJackBase;
public interface PDeck {

	/** Randomizes the deck. */
	public void shuffle();

	/** Adds a card to the end of the deck. */
	public void addCard(PCard card);

	/** Removes a card from the end of the deck. Returns Null if the deck is empty.*/
	public PCard dealCard();

	/** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty.*/
	public PCard dealHiddenCard();

	/** Returns the number of cards in the deck. */
	public int cardCount();
}
