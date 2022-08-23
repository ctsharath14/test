public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.assignCards();
        System.out.println("<------------------------------------->");
        deckOfCards.shuffleCards();
        deckOfCards.distributeCards();
        System.out.println("<------------------------------------->");
        deckOfCards.displayCards();
    }
}
