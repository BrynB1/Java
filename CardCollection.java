package Sophmore;

import java.util.ArrayList;
import java.util.Random;
public class CardCollection {
    private final String label;
    private final ArrayList<Card> cards;
    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<>();
    }
    public String getLabel() {
        return label;
    }
    public Card getCardAt(int i) {
        return cards.get(i);
    }
    public Card last() {
        int i = size() - 1;
        return getCardAt(i);
    }
    public void append(Card card) {
        cards.add(card);
    }
    public Card removeAt(int i) {
        return cards.remove(i);
    }
    public Card removeLast() {
        int i = size() - 1;
        return removeAt(i);
    }
    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void swapAt(int i, int j) {
        append(cards.get(i));
        cards.set(i, cards.get(j));
        cards.set(j, removeLast());
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = size() - 1; i > 0; i--) {
            int j = random.nextInt(i);
            swapAt(i, j);
        }
    }
    public String toString() {
        return label + ": " + cards;
    }
    public void display() {
        System.out.println(label + ": ");
        for (Card card: cards){
            System.out.println(card);
        }
        System.out.println();
    }

}
