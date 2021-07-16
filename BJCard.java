package BlackJack;
import BlackJackBase.PCard;
import java.awt.*;
public class BJCard extends PCard {
	    // Attributes of this class
	    int rank;
	    int suit;
	    boolean hidden;

	    // 18 public constants

	    // 14 CARDS (assign interger value 1-14)
	    public static final int ACE = 1;
	    public static final int TWO = 2;
	    public static final int THREE = 3;
	    public static final int FOUR = 4;
	    public static final int FIVE = 5;
	    public static final int SIX = 6;
	    public static final int SEVEN = 7;
	    public static final int EIGHT = 8;
	    public static final int NINE = 9;
	    public static final int TEN = 10;
	    public static final int JACK = 11;
	    public static final int KNIGHT = 12;
	    public static final int QUEEN = 13;
	    public static final int KING = 14;

	    // 4 SUITS (assign interger value 1-4)
	    public static final int SPADE = 1;
	    public static final int HEART = 2;
	    public static final int DIAMOND = 3;
	    public static final int CLUB = 4;

	    // Constructors
	    public BJCard(int rank, int suit) {
	        super(); // call super class constructor
	        hidden = false; // set the hidden attribute false
	        this.rank = rank; // set rank attribute value
	        this.suit = suit; // set suit attribute value
	    }

	    // Getter and setter nethods for suit and rank

	    // Getter method for rank attribute
	    public int getRank() {
	        // return rank attribute value
	        return this.rank;
	    }

	    // Getter method for suit attribute
	    public int getSuit() {
	        // return suit attribute value
	        return this.suit;
	    }

	    // Setter method for rank attribute
	    public void setRank(int rank) {
	        // set rank attribute value
	        this.rank = rank;
	    }

	    // Setter method for suit attribute
	    public void setSuit(int suit) {
	        // set suit attribute value
	        this.suit = suit;
	    }

	    // Override the abstract methods of PCard
	    @Override
	    // Sets the card to the face down state.
	    public void hideCard() {
	        // set hidden attribute to true 
	        hidden = true;
	    }

	    @Override
	    // Sets the card to the face up state
	    public void showCard() {
	        // set hidden attribute to false 
	        hidden = false;
	    }

	    @Override
	    // Finds if the card if face-down or face-up.
	    // Returns true if the card if face down
	    public boolean isHidden() {
	        return hidden;
	    }

	    @Override
	    // Returns a string containing both the rank and suit of the card
	    public String getText() {
	        String suitStr = suitString();
	        String rankStr = rankString();
	        return rankStr + suitStr;
	    }

	    // Returns the color of the font used for the card text
	    public Color getFontColor() {
	        // For red cards
	        if (suit == 2 || suit == 3) {
	            return Color.RED;
	        
	        // Black cards
	        } else {
	            return Color.BLACK;
	        }
	    }

	    // Helper method to convert interger rank into respective string represention
	    private String rankString() {
	        String rankStr = "";
	        switch (rank) {
	            case 1:
	                rankStr = "A";
	                break;
	            case 11:
	                rankStr = "J";
	                break;
	            case 12:
	                rankStr = "Kn";
	                break;
	            case 13:
	                rankStr = "Q";
	                break;
	            case 14:
	                rankStr = "K";
	                break;
	            default:
	                rankStr = String.valueOf(rank);
	                break;
	        }
	        // return the card rank as string
	        return rankStr;
	    }

	    // Helper method to convert interger suit into respective string represention
	    private String suitString() {
	        String suitStr = "";
	        switch (suit) {
	            case 1:
	                suitStr = "♠";
	                break;
	            case 2:
	                suitStr = "♥";
	                break;
	            case 3:
	                suitStr = "♦";
	                break;
	            case 4:
	                suitStr = "♣";
	                break;
	        }
	        // return the suit rank as string
	        return suitStr;
	    }
	}


