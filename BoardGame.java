public class BoardGame {
    class Player {
        int id;
        int movedSpaces = 0;
    int spacesToMove;
    
    public Player(int id, ) {
        this.id = id;
        this.spacesToMove = rule;
    }
    
    public void move() {
    // custom move functionality
        movedSpaces += spacesToMove;
    }
    }


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    // generate card stack (deck)
    Stack<Integer> cardDeck = new Stack<Integer>();
    for (int i = 0; i < C; i++) {
    int randomSpace = Math.random(-M, M);
    cardDeck.push(randomSpace);
    }
    // generate players
    List<Player> players = new ArrayList<Player>();
    for (int i = 0; i < N; i++) {
        players.add(new Player(i));
    }
    // user provides list of N rules (default, default, 3, Math.random(), ...
    
    boolean gameOver = false;
    System.out.println("Would you like to play default rules or with catch-up rules in play (last player can move 2)?");
    rule = scanner.next();
    // play
    while (!gameOver) {
        for (Player player : players) {
        if (stack.isEmpty()) {
                System.out.println("Card deck is empty, moving forward 1 space by default");
            ++player.movedSpaces;
        } else { // otherwise request user input
            System.out.println("Would you like to move forward 1 space (MF) or draw a card from card deck (DC)?");
            String input = scanner.next();
            while (!input.equals("MF") && !input.equals("DC")) { // TODO: generate enums for values
                System.out.println("Please input MF or DC only");
                String input = scanner.next();
            }
            if (input.equals("MF")) { // player moves forward 1 space
            ++player.movedSpaces; // TODO: make fields private

            } else { // player draws card from deck
            int cardDrawn = stack.pop();
            player.movedSpaces += cardDrawn;
            }
        }
        // check if player has won
        if (player.movedSpaces >= M) {
            System.out.println("Player " + player.id + " has won the game after moving " + M + "spaces");
            gameOver = true;
        } else if (player.movedSpace < 0) { // 0 is minimum board field
            player.movedSpace = 0;
        }
        }
    }
    }
}


