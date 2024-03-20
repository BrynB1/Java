package Sophmore;

public record Card(int rank, int suit) {

    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"};

    public int score() {
        return rank;
    }

    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit];
    }

}
