package lab5;

/**
 * Created by pin4m on 20.11.2020.
 */

import java.util.*;

public class BlackJack {
    private static final String NAME_COMPUTER = "SuperMegaHandler";
    private static final int MAX_RANGE_COMPUTER = 15;
    private static final int MAX_SCORE = 21;
    private static final int MIN_AMOUNT_CARDS = 4;

    private final Scanner scanner;
    private final Desk desk;

    BlackJack(Scanner scanner, Desk desk) {
        this.scanner = scanner;
        this.desk = desk;
    }

    void start() {
        System.out.print("Input your name: ");
        String namePlayer = this.scanner.nextLine().trim();
        Player player = new Player(namePlayer, this.scanner, this.desk, MAX_SCORE);
        Player computer = new Player(NAME_COMPUTER, this.desk, MAX_RANGE_COMPUTER, MAX_SCORE);
        int count = 1;
        boolean gameNext = true;
        while (gameNext && this.desk.amountCards() >= MIN_AMOUNT_CARDS) {
            System.out.println("\n\n" + this.desk);
            System.out.println("Hashing cards...");
            this.desk.hashingCards();
            System.out.println("\nStart game #" + count + ":");
            gameNext = game(player, computer);
            count++;
        }
        printFullWinner(player, computer);
        System.out.println("End game...");
    }

    private void printFullWinner(Player first, Player second) {
        Player winner = null;
        if (first.isLose()) {
            winner = second;
            System.out.printf("Winner is player [%s]!!!\n", second.getName());
        } else if (second.isLose()) {
            winner = first;
        } else {
            System.out.println(first);
            System.out.println(second);
            if (first.getWin() > second.getWin()) {
                winner = first;
            } else if (first.getWin() < second.getWin()) {
                winner = second;
            }
        }
        System.out.println(winner != null ?
                String.format("Winner is player [%s]!!!", winner.getName()) :
                "Oops... winner not found!");
    }

    private boolean game(Player first, Player second) {
        first.getCard(2);
        second.getCard(2);
        System.out.println(first.getCardsAndSumNow());
        System.out.println(second.getCardsAndSumNow());
        boolean nextFirst = true;
        boolean nextSecond = true;
        while (nextFirst || nextSecond) {
            nextFirst = first.move();
            nextSecond = second.move();
        }
        return searchWinner(first, second);
    }

    private boolean searchWinner(Player first, Player second) {
        boolean result;
        if (result = !first.isLose() && !second.isLose()) {
            if (first.getPlayerHand().getSum() > second.getPlayerHand().getSum()) {
                first.incWin();
                second.incLose();
                printWinner(first, second, false);
            } else if (first.getPlayerHand().getSum() < second.getPlayerHand().getSum()) {
                second.incWin();
                first.incLose();
                printWinner(second, first, false);
            } else {
                if (first.getPlayerHand().getSum() == MAX_SCORE) {
                    if (first.getPlayerHand().isBlackJack()) {
                        printWinner(first, second, true);
                    } else if (second.getPlayerHand().isBlackJack()) {
                        printWinner(second, first, true);
                    }
                } else {
                    System.out.println("Winner not found this game;");
                }
            }
            first.update();
            second.update();
        }
        return result;
    }

    private void printWinner(Player winner, Player loser, boolean blackJack) {
        winner.getCardsAndSumNow();
        loser.getCardsAndSumNow();
        System.out.printf("Winner this game: Player [%s]%s;\n", winner.getName(), blackJack ? ". He is BlackJack" : "");
    }
}
