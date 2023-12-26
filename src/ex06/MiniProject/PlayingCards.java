package ex06.MiniProject;

import java.util.Arrays;

class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + " " + rank;
    }
}

class Deck {
    Card[] cards;
    int index;

    public Deck() {
        cards = new Card[52];
        index = 0;
        String[] suits = {"클럽", "다이아몬드", "하트", "스페이드"};
        String[] ranks = {"에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[index] = new Card(suits[i], ranks[j]);
                index++;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            result += cards[i] + ", ";
            count++;
            if (count % 13 == 0) {
                result += "\n";
            }
        }
        return result;
    }
}

public class PlayingCards {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);

    }
}
