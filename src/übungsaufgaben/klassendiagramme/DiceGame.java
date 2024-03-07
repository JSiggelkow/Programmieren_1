package übungsaufgaben.klassendiagramme;

import übungsaufgaben.objectOriented.Dice;
import übungsaufgaben.objectOriented.DiceCup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGame {
    private DiceCup diceCup;
    private ArrayList<Dice> dices;
    private ArrayList<Player> players;
    private int numberOfActivePlayers;

    public DiceGame(ArrayList<Player> players) {
        this.players = players;
        players.forEach(player -> player.setActive(true));
        diceCup = new DiceCup();
        dices = new ArrayList<>();
        dices.addAll(List.of(new Dice(1), new Dice(2), new Dice(3)));
        numberOfActivePlayers = players.size();
    }

    public void start() {
        do {
            players.forEach(p -> {
                if (p.isActive()) {
                    System.out.printf("%s hat aktuell %d Punkte%n", p.getName(), p.getScore());
                    move(p);
                    if (p.getScore() > 50) {
                        p.setActive(false);
                        System.out.printf("%s hat verloren%n", p.getName());
                    }
                }
            });
        } while (players.stream().anyMatch(Player::isActive));

        Player winner = new Player("winner");
        for (Player p : players) {
            if (p.getScore() > winner.getScore() && p.getScore() <= 50) {
                winner = p;
            }
        }
        System.out.printf("Der Sieger heißt %s und hat %d Punkte%n", winner.getName(), winner.getScore());
    }

    public void move(Player p) {
        System.out.printf("%s, möchtest du würfeln (true/false)?:", p.getName());
        boolean wantsToPlay = new Scanner(System.in).nextBoolean();
        if (wantsToPlay) {
            diceCup.rollTheDices(dices);
            System.out.printf("%s hat %s Punkte%n", p.getName(), diceCup.sumOfDice(dices));
            p.setScore(diceCup.sumOfDice(dices));
            System.out.printf("%s hat insgesamt %d Punkte%n", p.getName(), p.getScore());
        } else {
            p.setActive(false);
        }
    }


}
