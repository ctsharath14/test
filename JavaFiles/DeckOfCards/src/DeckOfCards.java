public class DeckOfCards {
    int players = 4;
    int playerCards = 9;
    String[][] playerArray = new String[players][playerCards];
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] deck = new String[52];


    //Assigning cards value
    public void assignCards() {
        System.out.println("All the available cards are: ");
        for (int i = 0; i < deck.length; i++) {
            deck[i] = ranks[i % 13] +" "+ suits[i / 13];
            System.out.println(deck[i]);
        }
    }

    //Shuffle the cards
    public void shuffleCards() {
        System.out.println("Cards after shuffling are as follows: ");
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //to print the shuffled card
        for (int i=0; i< deck.length; i++){
            System.out.println(deck[i]);
        }
    }

    //Distribute 9 cards to 4 players
    public void distributeCards() {
        int count = 0;
        for(int i=0; i<players; i++){
            for (int j=0; j<playerCards; j++){
                playerArray[i][j] = deck[count++];
            }
        }
    }

    //Display cards of all players
    public void displayCards() {
        for(int i=0; i<players; i++){
            for (int j=0; j<playerCards; j++){
                System.out.println("Player"+(i+1)+" card : "+playerArray[i][j]);
            }
            System.out.println();
        }
    }
}
