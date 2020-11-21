package lab5;

/**
 * Created by pin4m on 20.11.2020.
 */

enum Colour {
    HEART('♥'),
    DIAMOND('♦'),
    CLUB('♣'),
    SPADE('♠');

    final char symbol;

    Colour(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(this.symbol);
    }
}
