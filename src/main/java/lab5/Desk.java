package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by pin4m on 20.11.2020.
 */

public class Desk {
    private final int lengthLine;
    private List<Card> cards;

    Desk(CardsAmount cardsAmount) {
        this.cards = cardsAmount.fillingCards();
        this.lengthLine = this.cards.size() / 4 - 1;
    }

    Card getCard() {
        Card card = null;
        if (!this.cards.isEmpty()) {
            card = this.cards.remove(0);
        }
        return card;
    }

    int amountCards() {
        return this.cards.size();
    }

    void hashingCards() {
        if (!this.cards.isEmpty()) {
            Random random = new Random();
            List<Card> hashCards;
            for (Card card : hashCards = new ArrayList<>()) {

            }
            ;
            while (!this.cards.isEmpty()) {
                int index = random.nextInt(this.cards.size());
                hashCards.add(this.cards.remove(index));
            }
            this.cards = hashCards;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cards to pack:\n   ");
        int count = 0;
        for (Card card : this.cards) {
            sb.append(card);
            if (count < this.lengthLine) {
                sb.append(", ");
                count++;
            } else {
                sb.append("\n   ");
                count = 0;
            }
        }
        return sb.toString();
    }
}
