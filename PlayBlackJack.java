package BlackJackTest;

import BlackJack.BJCard;

public class PlayBlackJack {
    // Main method
    public static void main(String[] args) {
        // Create an object of BJCard
        BJCard card = new BJCard(14, 3);
        // Call the run() method of CardTest and 
        // pass card object created above.
        CardTest.run(card);
    }
}
