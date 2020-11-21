package lab5;

import java.util.Scanner;

/**
 * Created by pin4m on 20.11.2020.
 */

public class Player {
    private final String name;
    private final Scanner scanner;
    private final PlayerHand playerHand;
    private final int maxRangeForMove;
    private final int maxScore;

    private int win;
    private int lose;
    private boolean stop;

    PlayerHand getPlayerHand() {
        return playerHand;
    }

    String getName() {
        return name;
    }

    int getWin() {
        return win;
    }

    private Player(String name, Scanner scanner, Desk desk, int maxRangeForMove, int maxScore) {
        this.name = name;
        this.scanner = scanner;
        this.playerHand = new PlayerHand(desk);
        this.maxRangeForMove = maxRangeForMove;
        this.maxScore = maxScore;
    }

    Player(String name, Scanner scanner, Desk desk, int maxScore) {
        this(name, scanner, desk, 0, maxScore);
    }

    Player(String name, Desk desk, int maxRangeForMove, int maxScore) {
        this(name, null, desk, maxRangeForMove, maxScore);
    }

    void incWin() {
        this.win++;
    }

    void incLose() {
        this.lose++;
    }

    boolean isLose() {
        return this.playerHand.getSum() > this.maxScore;
    }

    boolean move() {
        return this.scanner == null ? autoMove() : isMove();
    }

    void update() {
        this.playerHand.continueGame();
        this.stop = false;
    }

    void getCard(int count) {
        for (int amount = 0; amount < count; amount++) {
            this.playerHand.getCard();
        }
    }

    private boolean isMove() {
        boolean result;
        if (result = !isLose()) {
            if (result = !this.stop) {
                System.out.print("Will you take the card?[y/n]: ");
                String answer = this.scanner.nextLine().trim().toLowerCase();
                if ("y".equals(answer)) {
                    System.out.printf("Player [%s] get card...\n", this.name);
                    this.getCard(1);
                    System.out.println(getCardsAndSumNow());
                } else {
                    this.stop = true;
                }
            }
        }
        return result;
    }

    private boolean autoMove() {
        boolean result;
        if (result = !isLose()) {
            if (result = this.playerHand.getSum() <= this.maxRangeForMove) {
                System.out.printf("Player [%s] get card...\n", this.name);
                this.playerHand.getCard();
                System.out.println(getCardsAndSumNow());
            }
        }
        return result;
    }

    String getCardsAndSumNow() {
        return String.format("Player [%s]: cards: %s; sum cards: %d;", this.name, this.playerHand, this.playerHand.getSum());
    }

    @Override
    public String toString() {
        return String.format("Player [%s]: win = %d; lose = %d;", this.name, this.win, this.lose);
    }
}
