package BlackJack;

public class BJDeck {


	

	private static Player playerOne = new Player("Bob"); private static Player playerTwo = new Player("Alice"); private static ArrayList<Card> table = new ArrayList<>(); private static Card topCard; private static int roundsPlayed = 1;

	private static Player currentPlayer = playerOne;

	private static Deck deck = new Deck(true);

	private static boolean gameOver = false; public static void main(String[] args) { playGame();

	}

	public static void playGame() {

	System.out.println("Starting simple card game simulation...");

	System.out.println();

	dealCards();

	chooseFirst Player();

	playRounds();

	declare Winner();

	}

	public static void dealCards() {

	for (int i = 0; i < 26; i++) {

	playerOne.takeCard(deck.deal());

	playerTwo.takeCard(deck.deal());

	}

	}

	public static void chooseFirstPlayer() {

	Random random = new Random();

	int n = random.nextInt(2);

	if (n == 1) {

	Player temp = playerOne;

	playerOne player Two;

	playerTwo = temp;

	public static void playRounds() {

	while (roundsPlayed <= 10 && (gameOver == false)) {

	System.out.println("ROUND" + rounds Played);

	System.out.println();

	displayHands();

	playRound();

	roundsPlayed++;

	} }

	public static void playRound() {

	boolean suitMatch = false;

	Card cardToPlay;

	if ((playerOne.handSize() == 52) || (playerTwo.handSize()

	gameOver= true;

	52)) {

	}

	while (suitMatch == false) {

	cardToPlay = currentPlayer.playCard();

	table.add(cardToPlay);

	suitMatch = checkSuitMatch();

	if (suitMatch == false)

	switchCurrentPlayer();

	}

	collectCards();

	System.out.println();

	try {

	Thread.sleep(500);

	}

	catch (InterruptedException e) {

	}

	}

	public static void switchCurrent Player() { if (currentPlayer == playerOne)

	currentPlayer = player Two;

	else if (currentPlayer

	player Two)

	currentPlayer = playerOne;

	}

	public static boolean checkSuitMatch() {

	int tableSize = table.size();

	int lastSuit;

	int topSuit;

	if (tableSize < 2) {

	return false;

	}

	else {

	lastSuit table.get(tableSize 1).getSuit();

	topSuit = table.get(tableSize - 2).getSuit();

	}

	if (lastSuit == topSuit) {

	System.out.println();

	System.out.println(currentPlayer.getName() + "wins the round!");

	System.out.println();

	return true;

	} return false;

	}

	public static void collectCards() {

	System.out.print(currentPlayer.getName() + " takes

	table.size()+"): ");

	display Table();

	for (int i = 0; i < table.size(); i++) {

	Card cardToTake = table.get(i);

	currentPlayer.takeCard(cardToTake);

	the table ("+

	}

	table.clear();

	}

	public static void display Table() {

	for (int i = 0; i < table.size(); i++) {

	if (table.get(i) != null) {

	System.out.print(table.get(i).getName() + " ");

	System.out.println();

	System.out.println();

	}

	public static void displayHands() {

	playerOne.displayHand();

	player Two.displayHand();

	}

	public static void declareWinner() {

	if (playerOne.handSize() > playerTwo.handSize()) {

	System.out.println(playerOne.getName().toUpperCase() + "WINS" +

	"WITH A TOTAL OF" + playerOne.handSize() + " CARDS!");

	}

	else if (playerTwo.handSize() > playerOne.handSize()) {

	System.out.println(playerTwo.getName().toUpperCase() + "WINS" +

	"WITH A TOTAL OF " + playerTwo.handSize() + " CARDS!");

	}

	else {

	System.out.println("TIE! WOW IT'S SUPER RARE!");

	}

	System.out.println();

	}

	}



