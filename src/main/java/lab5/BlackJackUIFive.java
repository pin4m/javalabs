package lab5;

import java.util.Scanner;

/**
 * Created by pin4m on 20.11.2020.
 */

public class BlackJackUIFive {
    public static void main(String[] args) {
        new BlackJack(new Scanner(System.in), new Desk(CardsAmount.CARDS_52)).start();
    }
}
