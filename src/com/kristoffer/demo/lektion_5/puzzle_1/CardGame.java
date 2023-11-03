package com.kristoffer.demo.lektion_5.puzzle_1;

import java.util.ArrayList;
import java.util.List;

public class CardGame {

    private List<Card> deck = new ArrayList<>(52);  // 52 cards!

    public void generateDeckOfCards() {

        // Variables
        String suit = "";
        String value = "";

        // 52 Cards Generation //
        for (int i = 1; i <= 4; i++) {

            // Determine Suit
            switch (i) {
                case 1 -> suit = "clubs (♣)";
                case 2 -> suit = "diamonds (♦)";
                case 3 -> suit = "hearts (♥)";
                case 4 -> suit = "spades (♠)";

                default -> throw new RuntimeException();
            }

            // Generate Value
            for (int j = 1; j <= 13; j++) {

                switch (j) {
                    case 1 -> value = "ACE";
                    case 2,3,4,5,6,7,8,9,10 -> value = String.valueOf(j);
                    case 11 -> value = "Jack";
                    case 12 -> value = "Queen";
                    case 13 -> value = "King";

                    default -> throw new RuntimeException();
                }

                getDeck().add(new Card(
                        suit,
                        value
                ));

                System.out.println("Value: " + value + " Symbol: " + suit);
            }
        }

    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}
